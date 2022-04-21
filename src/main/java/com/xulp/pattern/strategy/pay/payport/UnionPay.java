package com.xulp.pattern.strategy.pay.payport;

/**
 * @author xulp
 * @version v1.0.0
 * @Date 2022/4/21 16:56
 * @Description ---
 * UnionPay
 * Modification History:
 * Date Author Version Description
 * ---------------------------------------------------------------------------------*
 * 2022/4/21 16:56 xulp v1.0.0 Created
 */
public class UnionPay extends Payment {
    @Override
    public String getName() {
        return "银联支付";
    }

    @Override
    protected double queryBalance(Integer uid) {
        return 20;
    }
}
