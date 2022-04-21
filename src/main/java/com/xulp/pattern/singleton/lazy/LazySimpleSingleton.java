package com.xulp.pattern.singleton.lazy;

/**
 * @author xulp
 * @version v1.0.0
 * @Date 2022/4/11 15:41
 * @Description 单例模式：简单饿汉式
 * LazySimpleSingleton
 * Modification History:
 * Date Author Version Description
 * ---------------------------------------------------------------------------------*
 * 2022/4/11 15:41 xulp v1.0.0 Created
 */
public class LazySimpleSingleton {

    private static LazySimpleSingleton lazySimpleSingleton = null;

    private LazySimpleSingleton() {
    }

    public static LazySimpleSingleton getInstance() {
        if (null == lazySimpleSingleton) {
            lazySimpleSingleton = new LazySimpleSingleton();
        }

        return lazySimpleSingleton;
    }
}
