package com.xulp.pattern.strategy.pay.payport;

import java.util.HashMap;
import java.util.Map;

/**
 * @author xulp
 * @version v1.0.0
 * @Date 2022/4/21 16:59
 * @Description ---
 * PayStrategy
 * Modification History:
 * Date Author Version Description
 * ---------------------------------------------------------------------------------*
 * 2022/4/21 16:59 xulp v1.0.0 Created
 */
public class PayStrategy {
    public static final String ALI_PAY = "aliPay";
    public static final String JD_PAY = "jdPay";
    public static final String WECHAT_PAY = "weChatPay";
    public static final String UNION_PAY = "unionPay";
    public static final String DEFAULT_PAY = ALI_PAY;


    private static Map<String, Payment> payStrategy = new HashMap<>();

    static {
        payStrategy.put(ALI_PAY, new AliPay());
        payStrategy.put(JD_PAY, new JDPay());
        payStrategy.put(WECHAT_PAY, new WeChatPay());
        payStrategy.put(UNION_PAY, new UnionPay());
    }

    // 通过统一入口实现动态策略
    public static Payment get(String payKey) {
        if (!payStrategy.containsKey(payKey)) {
            return payStrategy.get(DEFAULT_PAY);
        }
        return payStrategy.get(payKey);
    }
}
