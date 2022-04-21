package com.xulp.pattern.strategy.promotion;

/**
 * @author xulp
 * @version v1.0.0
 * @Date 2022/4/21 11:22
 * @Description 无优惠
 * EmptyStrategy
 * Modification History:
 * Date Author Version Description
 * ---------------------------------------------------------------------------------*
 * 2022/4/21 11:22 xulp v1.0.0 Created
 */
public class EmptyStrategy implements PromotionStrategy {
    @Override
    public void doPromotion() {
        System.out.println("无促销活动");
    }
}
