package com.xulp.pattern.strategy.promotion;

import java.util.HashMap;
import java.util.Map;

/**
 * @author xulp
 * @version v1.0.0
 * @Date 2022/4/21 15:41
 * @Description 促销策略工厂类：
 * PromotionStrategyFactory
 * Modification History:
 * Date Author Version Description
 * ---------------------------------------------------------------------------------*
 * 2022/4/21 15:41 xulp v1.0.0 Created
 */
public class PromotionStrategyFactory {
    // 注册式单例
    private static Map<String, PromotionStrategy> PROMOTION_STRATEGY_MAP = new HashMap<>();

    static {
        PROMOTION_STRATEGY_MAP.put(PromotionKey.COUPON, new CouponStrategy());
        PROMOTION_STRATEGY_MAP.put(PromotionKey.CASH_BACK, new CashBackStrategy());
        PROMOTION_STRATEGY_MAP.put(PromotionKey.GROUP_BUY, new GroupBuyStrategy());
    }

    private static PromotionStrategy NOT_PROMOTION_STRATEGY = new EmptyStrategy();

    private PromotionStrategyFactory() {
    }

    public static PromotionStrategy getPromotionStrategy(String promotionKey) {
        PromotionStrategy promotionStrategy = PROMOTION_STRATEGY_MAP.get(promotionKey);
        return promotionStrategy == null ? NOT_PROMOTION_STRATEGY : promotionStrategy;
    }

    private interface PromotionKey {
        String COUPON = "COUPON";
        String CASH_BACK = "CASH_BACK";
        String GROUP_BUY = "GROUP_BUY";
    }
}
