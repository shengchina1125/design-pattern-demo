package com.xulp.factory.simplefactory;

import com.xulp.factory.bean.ICar;

/**
 * @author xulp
 * @version v1.0.0
 * @Date 2022/2/19 16:08
 * @Description 简单工厂：通过类名创建对应的实例
 * CarSimpleFactory
 * Modification History:
 * Date Author Version Description
 * ---------------------------------------------------------------------------------*
 * 2022/2/19 16:08 xulp v1.0.0 Created
 */
public class CarSimpleFactory {

    //public ICar create(String name) {
    //    if (null == name || "".equals(name)) {
    //        return null;
    //    }
    //    if ("audi".equals(name)) {
    //        return new AudiCar();
    //    }
    //    if ("benz".equals(name)) {
    //        return new BenzCar();
    //    }
    //    if ("BMW".equals(name)) {
    //        return new BMWCar();
    //    }
    //    return null;
    //}

    public ICar create(String className) {
        try {
            if (null != className && !"".equals(className)) {
                return (ICar) Class.forName(className).newInstance();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public ICar create(Class clazz) {
        try {
            if (null != clazz) {
                return (ICar) clazz.newInstance();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
