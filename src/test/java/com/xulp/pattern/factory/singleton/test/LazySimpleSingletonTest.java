package com.xulp.pattern.factory.singleton.test;

/**
 * @author xulp
 * @version v1.0.0
 * @Date 2022/4/11 15:46
 * @Description ---
 * LazySimpleSingletonTest
 * Modification History:
 * Date Author Version Description
 * ---------------------------------------------------------------------------------*
 * 2022/4/11 15:46 xulp v1.0.0 Created
 */
public class LazySimpleSingletonTest {

    public static void main(String[] args) {
        // LazySimpleSingleton.getInstance();

        Thread t1 = new Thread(new ExectorThread());
        Thread t2 = new Thread(new ExectorThread());
        t1.start();

        t2.start();

        System.out.println("Exector End");
    }
}
