package com.xulp.singleton.lazy;

/**
 * @author xulp
 * @version v1.0.0
 * @Date 2022/4/11 16:12
 * @Description 单例模式：静态内部类：性能最优的一种写法
 * LazyInterClassSingleton
 * Modification History:
 * Date Author Version Description
 * ---------------------------------------------------------------------------------*
 * 2022/4/11 16:12 xulp v1.0.0 Created
 */
public class LazyInterClassSingleton {
    /**
     * 虽然构造方法私有了，但是，逃不过反射的法眼
     */
    private LazyInterClassSingleton() {
        throw new RuntimeException("不允许创建多个实例");
    }

    // LazyHolder 里面的逻辑需要等到外部方法调用时才执行
    //巧妙利用了内部类的特性
    //JVM底层执行逻辑，完美地避开了线程安全问题
    public static final LazyInterClassSingleton getInstance() {
        return LazyHolder.LAZY;
    }

    private static class LazyHolder {
        private static final LazyInterClassSingleton LAZY = new LazyInterClassSingleton();
    }

}
