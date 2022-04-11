package com.xulp.factory.bean;

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
public class AudiCarLogo implements ICarLogo {
    @Override
    public void recode() {
        System.out.println("奥迪车标");
    }
}
