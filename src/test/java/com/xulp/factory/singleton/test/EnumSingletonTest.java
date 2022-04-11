package com.xulp.factory.singleton.test;

import com.xulp.singleton.register.EnumSingleton;

import java.lang.reflect.Constructor;

/**
 * @author xulp
 * @version v1.0.0
 * @Date 2022/4/11 17:31
 * @Description ---
 * EnumSingletonTest
 * Modification History:
 * Date Author Version Description
 * ---------------------------------------------------------------------------------*
 * 2022/4/11 17:31 xulp v1.0.0 Created
 */
public class EnumSingletonTest {

    public static void main(String[] args) {
        try {
            Class<?> clazz = EnumSingleton.class;
            // Constructor c = clazz.getDeclaredConstructor();
            Constructor c = clazz.getDeclaredConstructor(String.class, int.class);
            c.setAccessible(true);
            EnumSingleton enumSingleton = (EnumSingleton) c.newInstance();
            System.out.println(enumSingleton);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
