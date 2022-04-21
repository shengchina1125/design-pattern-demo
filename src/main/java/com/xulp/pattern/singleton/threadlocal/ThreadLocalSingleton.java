package com.xulp.pattern.singleton.threadlocal;

/**
 * @author xulp
 * @version v1.0.0
 * @Date 2022/4/11 18:02
 * @Description 单例模式：线程式单例：伪线程安全，同一个线程安全，不同的线程不安全，使用ThreadLocal来实现多数据源动态切换
 * ThreadLocalSingleton
 * Modification History:
 * Date Author Version Description
 * ---------------------------------------------------------------------------------*
 * 2022/4/11 18:02 xulp v1.0.0 Created
 */
public class ThreadLocalSingleton {
    private ThreadLocalSingleton() {
    }

    private static final ThreadLocal<ThreadLocalSingleton> threadLocalInstance =
            new ThreadLocal<ThreadLocalSingleton>() {
                @Override
                protected ThreadLocalSingleton initialValue() {
                    return new ThreadLocalSingleton();
                }
            };

    public static ThreadLocalSingleton getInstance() {
        return threadLocalInstance.get();
    }
}
