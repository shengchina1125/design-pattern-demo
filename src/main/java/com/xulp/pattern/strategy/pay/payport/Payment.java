package com.xulp.pattern.strategy.pay.payport;

import com.xulp.pattern.strategy.pay.MsgResult;

/**
 * @author xulp
 * @version v1.0.0
 * @Date 2022/4/21 16:49
 * @Description ---
 * Payment
 * Modification History:
 * Date Author Version Description
 * ---------------------------------------------------------------------------------*
 * 2022/4/21 16:49 xulp v1.0.0 Created
 */
public abstract class Payment {

    public abstract String getName();

    protected abstract double queryBalance(Integer uid);

    public MsgResult pay(Integer uid, double amount) {
        if (queryBalance(uid) < amount) {
            return new MsgResult(500, "支付失败", "余额不足");
        }
        return new MsgResult(200, "支付成功", "支付金额：" + amount);
    }
}
