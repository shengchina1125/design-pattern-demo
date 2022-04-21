package com.xulp.pattern.factory.bean;

/**
 * @author xulp
 * @version v1.0.0
 * @Date 2022/2/19 16:13
 * @Description ---
 * AudiCar
 * Modification History:
 * Date Author Version Description
 * ---------------------------------------------------------------------------------*
 * 2022/2/19 16:13 xulp v1.0.0 Created
 */
public class BenzCar implements ICar {
    @Override
    public void brand() {
        System.out.println("奔驰品牌");
    }
}
