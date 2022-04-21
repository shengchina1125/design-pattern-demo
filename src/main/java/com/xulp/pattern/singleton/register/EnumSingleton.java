package com.xulp.pattern.singleton.register;

/**
 * @author xulp
 * @version v1.0.0
 * @Date 2022/4/11 17:29
 * @Description 单例模式：枚举式单例
 * EnumSingleton
 * Modification History:
 * Date Author Version Description
 * ---------------------------------------------------------------------------------*
 * 2022/4/11 17:29 xulp v1.0.0 Created
 */
public enum EnumSingleton {

    INSTANCE;

    private Object data;

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    private static EnumSingleton getInstance() {
        return INSTANCE;
    }

}
