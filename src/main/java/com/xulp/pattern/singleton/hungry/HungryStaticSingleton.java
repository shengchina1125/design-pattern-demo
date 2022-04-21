package com.xulp.pattern.singleton.hungry;

/**
 * @author xulp
 * @version v1.0.0
 * @Date 2022/4/11 15:34
 * @Description 单例模式：静态饿汉式 直接创建
 * HungrySingleton
 * Modification History:
 * Date Author Version Description
 * ---------------------------------------------------------------------------------*
 * 2022/4/11 15:34 xulp v1.0.0 Created
 */
public class HungryStaticSingleton {
    private static final HungryStaticSingleton hungrySingleton;

    static {
        hungrySingleton = new HungryStaticSingleton();
    }

    private HungryStaticSingleton() {
    }

    public static HungryStaticSingleton getInstance() {
        return hungrySingleton;
    }
}
