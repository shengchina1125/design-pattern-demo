package com.xulp.pattern.strategy.pay;

import com.xulp.pattern.strategy.pay.payport.PayStrategy;

/**
 * @author xulp
 * @version v1.0.0
 * @Date 2022/4/21 16:57
 * @Description ---
 * PayStrategyTest
 * Modification History:
 * Date Author Version Description
 * ---------------------------------------------------------------------------------*
 * 2022/4/21 16:57 xulp v1.0.0 Created
 */
public class PayStrategyTest {

    public static void main(String[] args) {
        Order order = new Order(1, "20220421165900000", 321.25);
        MsgResult result = order.pay(PayStrategy.UNION_PAY);
        System.out.println(result);
    }
}
