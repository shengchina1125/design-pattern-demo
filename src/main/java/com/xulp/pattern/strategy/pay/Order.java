package com.xulp.pattern.strategy.pay;

import com.xulp.pattern.strategy.pay.payport.PayStrategy;
import com.xulp.pattern.strategy.pay.payport.Payment;

/**
 * @author xulp
 * @version v1.0.0
 * @Date 2022/4/21 16:43
 * @Description ---
 * Order
 * Modification History:
 * Date Author Version Description
 * ---------------------------------------------------------------------------------*
 * 2022/4/21 16:43 xulp v1.0.0 Created
 */
public class Order {
    private int uid;
    private String orderId;
    private double amount;

    public Order(int uid, String orderId, double amount) {
        this.uid = uid;
        this.orderId = orderId;
        this.amount = amount;
    }

    public MsgResult pay(String payKey) {
        Payment payment = PayStrategy.get(payKey);
        System.out.println("欢迎使用" + payment.getName());
        System.out.println("本次交易金额为：" + amount + "，开始扣款...");
        return payment.pay(uid, amount);
    }
}
