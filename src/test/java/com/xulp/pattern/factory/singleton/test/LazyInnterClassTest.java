package com.xulp.pattern.factory.singleton.test;

import com.xulp.pattern.singleton.lazy.LazyInterClassSingleton;

import java.lang.reflect.Constructor;

/**
 * @author xulp
 * @version v1.0.0
 * @Date 2022/4/11 16:37
 * @Description ---
 * LazyInnterClassTest
 * Modification History:
 * Date Author Version Description
 * ---------------------------------------------------------------------------------*
 * 2022/4/11 16:37 xulp v1.0.0 Created
 */
public class LazyInnterClassTest {

    public static void main(String[] args) {
        try {
            // 调用者装B，不走寻常路，显然，破坏了单例
            Class<?> clazz = LazyInterClassSingleton.class;
            Constructor c = clazz.getDeclaredConstructor(null);
            c.setAccessible(true); // 强吻
            Object o1 = c.newInstance();
            Object o2 = LazyInterClassSingleton.getInstance();
            System.out.println(o1 == o2);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
