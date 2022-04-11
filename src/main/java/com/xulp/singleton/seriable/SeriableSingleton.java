package com.xulp.singleton.seriable;

import java.io.Serializable;

/**
 * @author xulp
 * @version v1.0.0
 * @Date 2022/4/11 17:22
 * @Description 单例模式：序列化单例
 * SeriableSingleton
 * Modification History:
 * Date Author Version Description
 * ---------------------------------------------------------------------------------*
 * 2022/4/11 17:22 xulp v1.0.0 Created
 */
public class SeriableSingleton implements Serializable {
    private static final SeriableSingleton seriableSingleton = new SeriableSingleton();

    private SeriableSingleton() {
    }

    public static SeriableSingleton getInstance() {
        return seriableSingleton;
    }

    /**
     * 重写 readResObject 方法，只不过是覆盖了反序列化出来的对象
     * 还是创建了两次，发生了在JVM层面，相对来说比较安全
     * 之前反序列化处理的对象会被GC回收
     */
    private Object readResObject() {
        return seriableSingleton;
    }
}
