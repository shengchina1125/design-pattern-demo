package com.xulp.pattern.factory.bean;

/**
 * @author xulp
 * @version v1.0.0
 * @Date 2022/2/24 17:23
 * @Description ---
 * AudiCarLogo
 * Modification History:
 * Date Author Version Description
 * ---------------------------------------------------------------------------------*
 * 2022/2/24 17:23 xulp v1.0.0 Created
 */
public class BenzCarLogo implements ICarLogo {
    @Override
    public void recode() {
        System.out.println("奔驰车标");
    }
}
