package com.xulp.pattern.adapter.loginadapter.v2;

import com.xulp.pattern.adapter.loginadapter.ResultMsg;

/**
 * @author xulp
 * @version v1.0.0
 * @Date 2022/4/25 15:48
 * @Description ---
 * IPassportForThird
 * Modification History:
 * Date Author Version Description
 * ---------------------------------------------------------------------------------*
 * 2022/4/25 15:48 xulp v1.0.0 Created
 */
public interface IPassportForThird {
    /**
     * QQ登录
     * @param id
     * @return
     */
    ResultMsg loginForQQ(String id);

    /**
     * 微信登录
     * @param id
     * @return
     */
    ResultMsg loginForWeChat(String id);

    /**
     * 记住登录状态后自动登录
     * @param token
     * @return
     */
    ResultMsg loginForToken(String token);

    /**
     * 手机号登录
     * @param telphone
     * @param code
     * @return
     */
    ResultMsg loginForTelPhone(String telphone, String code);

    /**
     * 注册后自动登录
     * @param username
     * @param passport
     * @return
     */
    ResultMsg loginForRegister(String username, String passport);
}
