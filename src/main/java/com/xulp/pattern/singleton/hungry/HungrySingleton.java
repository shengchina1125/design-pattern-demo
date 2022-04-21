package com.xulp.pattern.singleton.hungry;

/**
 * @author xulp
 * @version v1.0.0
 * @Date 2022/4/11 15:34
 * @Description 单例模式：饿汉式 直接创建
 * HungrySingleton
 * Modification History:
 * Date Author Version Description
 * ---------------------------------------------------------------------------------*
 * 2022/4/11 15:34 xulp v1.0.0 Created
 */
public class HungrySingleton {
    private static final HungrySingleton hungrySingleton = new HungrySingleton();

    private HungrySingleton() {
    }

    public static HungrySingleton getInstance() {
        return hungrySingleton;
    }
}
