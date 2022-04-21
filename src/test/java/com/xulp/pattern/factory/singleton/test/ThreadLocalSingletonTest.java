package com.xulp.pattern.factory.singleton.test;

import com.xulp.pattern.singleton.threadlocal.ThreadLocalSingleton;

/**
 * @author xulp
 * @version v1.0.0
 * @Date 2022/4/11 18:05
 * @Description ---
 * ThreadLocalSingletonTest
 * Modification History:
 * Date Author Version Description
 * ---------------------------------------------------------------------------------*
 * 2022/4/11 18:05 xulp v1.0.0 Created
 */
public class ThreadLocalSingletonTest {


    public static void main(String[] args) {
        System.out.println(ThreadLocalSingleton.getInstance());
        System.out.println(ThreadLocalSingleton.getInstance());
        System.out.println(ThreadLocalSingleton.getInstance());
        System.out.println(ThreadLocalSingleton.getInstance());
        System.out.println(ThreadLocalSingleton.getInstance());
        System.out.println(ThreadLocalSingleton.getInstance());
        System.out.println(ThreadLocalSingleton.getInstance());

        Thread t1 = new Thread(new ExectorThread());
        Thread t2 = new Thread(new ExectorThread());


        t1.start();
        t2.start();
    }
}
