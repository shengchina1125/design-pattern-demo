package com.xulp.pattern.factory.singleton.test;

import com.xulp.pattern.singleton.register.ContainerSingleton;

/**
 * @author xulp
 * @version v1.0.0
 * @Date 2022/4/11 17:53
 * @Description ---
 * ContainerSingletonTest
 * Modification History:
 * Date Author Version Description
 * ---------------------------------------------------------------------------------*
 * 2022/4/11 17:53 xulp v1.0.0 Created
 */
public class ContainerSingletonTest {


    public static void main(String[] args) {
        ContainerSingleton.getBean("com.xulp.singleton.register.ContainerSingleton");
    }
}
