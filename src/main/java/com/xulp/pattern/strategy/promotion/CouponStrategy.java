package com.xulp.pattern.strategy.promotion;

/**
 * @author xulp
 * @version v1.0.0
 * @Date 2022/4/21 11:24
 * @Description ---
 * CouponStrategy
 * Modification History:
 * Date Author Version Description
 * ---------------------------------------------------------------------------------*
 * 2022/4/21 11:24 xulp v1.0.0 Created
 */
public class CouponStrategy implements PromotionStrategy{
    @Override
    public void doPromotion() {
        System.out.println("领取优惠券，课程的价格直接减去优惠券面子抵扣");
    }
}
