package com.xulp.pattern.strategy.promotion;

/**
 * @author xulp
 * @version v1.0.0
 * @Date 2022/4/21 15:18
 * @Description ---
 * PromotionActivity
 * Modification History:
 * Date Author Version Description
 * ---------------------------------------------------------------------------------*
 * 2022/4/21 15:18 xulp v1.0.0 Created
 */
public class PromotionActivity {

    PromotionStrategy promotionStrategy;

    public PromotionActivity(PromotionStrategy promotionStrategy) {
        this.promotionStrategy = promotionStrategy;
    }

    public void execute() {
        this.promotionStrategy.doPromotion();
    }
}
