package com.xulp.pattern.strategy.promotion;

/**
 * @author xulp
 * @version v1.0.0
 * @Date 2022/4/21 15:13
 * @Description ---
 * GroupBuyStrategy
 * Modification History:
 * Date Author Version Description
 * ---------------------------------------------------------------------------------*
 * 2022/4/21 15:13 xulp v1.0.0 Created
 */
public class GroupBuyStrategy implements PromotionStrategy {
    @Override
    public void doPromotion() {
        System.out.println("拼团，满20人成团，全团享受团购价格");
    }
}
