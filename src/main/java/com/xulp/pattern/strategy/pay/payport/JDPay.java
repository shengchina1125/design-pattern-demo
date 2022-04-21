package com.xulp.pattern.strategy.pay.payport;

/**
 * @author xulp
 * @version v1.0.0
 * @Date 2022/4/21 16:55
 * @Description ---
 * JDPay
 * Modification History:
 * Date Author Version Description
 * ---------------------------------------------------------------------------------*
 * 2022/4/21 16:55 xulp v1.0.0 Created
 */
public class JDPay extends Payment {
    @Override
    public String getName() {
        return "京东白条";
    }

    @Override
    protected double queryBalance(Integer uid) {
        return 200;
    }
}
