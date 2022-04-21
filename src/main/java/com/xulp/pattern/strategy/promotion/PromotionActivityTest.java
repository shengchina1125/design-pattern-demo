package com.xulp.pattern.strategy.promotion;

import org.springframework.util.StringUtils;

/**
 * @author xulp
 * @version v1.0.0
 * @Date 2022/4/21 15:20
 * @Description ---
 * PromotionActivityTest
 * Modification History:
 * Date Author Version Description
 * ---------------------------------------------------------------------------------*
 * 2022/4/21 15:20 xulp v1.0.0 Created
 */
public class PromotionActivityTest {


    // public static void main(String[] args) {
    //
    //     // PromotionActivity promotionActivity618 = new PromotionActivity(new CouponStrategy());
    //     // PromotionActivity promotionActivity1111 = new PromotionActivity(new CashBackStrategy());
    //     //
    //     // promotionActivity618.execute();
    //     // promotionActivity1111.execute();
    //
    //
    //     // PromotionActivity promotionActivity = null;
    //     //
    //     // String promotionKey = "COUPON";
    //     //
    //     // if ("COUPON".equals(promotionKey)) {
    //     //     promotionActivity = new PromotionActivity(new CouponStrategy());
    //     // } else if ("CASHBACK".equals(promotionKey)) {
    //     //     promotionActivity = new PromotionActivity(new CashBackStrategy());
    //     // } //......
    //     // promotionActivity.execute();
    // }

    public static void main(String[] args) {
        String promotionKey = "CASH_BACK";
        PromotionActivity promotionActivity = new PromotionActivity(PromotionStrategyFactory.getPromotionStrategy(promotionKey));
        promotionActivity.execute();
    }
}
