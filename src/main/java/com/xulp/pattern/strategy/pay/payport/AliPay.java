package com.xulp.pattern.strategy.pay.payport;

/**
 * @author xulp
 * @version v1.0.0
 * @Date 2022/4/21 16:53
 * @Description ---
 * AliPay
 * Modification History:
 * Date Author Version Description
 * ---------------------------------------------------------------------------------*
 * 2022/4/21 16:53 xulp v1.0.0 Created
 */
public class AliPay extends Payment {
    @Override
    public String getName() {
        return "支付宝";
    }

    @Override
    protected double queryBalance(Integer uid) {
        return 900;
    }
}
