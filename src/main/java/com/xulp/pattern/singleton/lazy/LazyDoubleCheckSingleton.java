package com.xulp.pattern.singleton.lazy;

/**
 * @author xulp
 * @version v1.0.0
 * @Date 2022/4/11 15:41
 * @Description 单例模式：双重校验饿汉式
 * LazySimpleSingleton
 * Modification History:
 * Date Author Version Description
 * ---------------------------------------------------------------------------------*
 * 2022/4/11 15:41 xulp v1.0.0 Created
 */
public class LazyDoubleCheckSingleton {

    private volatile static LazyDoubleCheckSingleton lazySimpleSingleton = null;

    private LazyDoubleCheckSingleton() {
    }

    /**
     * 双重检查锁
     */
    public static LazyDoubleCheckSingleton getInstance() {
        if (null == lazySimpleSingleton) {
            synchronized (LazyDoubleCheckSingleton.class) {
                if (null == lazySimpleSingleton) {
                    lazySimpleSingleton = new LazyDoubleCheckSingleton();
                    // CUP执行时候会转换成JVM指令执行
                    // 指令重排序的问题，volatile
                    // 1.分配内存给这个对象
                    // 2.初始化对象
                    // 3.将初始化好的对象和内存地址建立关联，赋值
                    // 4.用户初次访问
                }
            }
        }

        return lazySimpleSingleton;
    }
}
