package com.xulp.pattern.strategy.promotion;

/**
 * @author xulp
 * @version v1.0.0
 * @Date 2022/4/21 15:15
 * @Description ---
 * CashBackStrategy
 * Modification History:
 * Date Author Version Description
 * ---------------------------------------------------------------------------------*
 * 2022/4/21 15:15 xulp v1.0.0 Created
 */
public class CashBackStrategy implements PromotionStrategy {
    @Override
    public void doPromotion() {
        System.out.println("返现促销，返回的金额转到支付宝账号");
    }
}
