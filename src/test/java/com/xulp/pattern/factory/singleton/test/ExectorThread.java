package com.xulp.pattern.factory.singleton.test;

import com.xulp.pattern.singleton.threadlocal.ThreadLocalSingleton;

/**
 * @author xulp
 * @version v1.0.0
 * @Date 2022/4/11 15:49
 * @Description ---
 * ExectorThread
 * Modification History:
 * Date Author Version Description
 * ---------------------------------------------------------------------------------*
 * 2022/4/11 15:49 xulp v1.0.0 Created
 */
// 不用线程池，就用两个
public class ExectorThread implements Runnable {
    @Override
    public void run() {
        // LazySimpleSingleton lazySimpleSingleton = LazySimpleSingleton.getInstance();
        // LazyDoubleCheckSingleton lazySimpleSingleton = LazyDoubleCheckSingleton.getInstance();

        ThreadLocalSingleton threadLocalSingleton = ThreadLocalSingleton.getInstance();

        System.out.println(Thread.currentThread().getName() + ":" + threadLocalSingleton);
    }
}
