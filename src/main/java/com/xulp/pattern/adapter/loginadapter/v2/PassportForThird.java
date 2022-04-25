package com.xulp.pattern.adapter.loginadapter.v2;

import com.xulp.pattern.adapter.loginadapter.ResultMsg;
import com.xulp.pattern.adapter.loginadapter.adapters.*;
import com.xulp.pattern.adapter.loginadapter.v1.service.SignService;

/**
 * @author xulp
 * @version v1.0.0
 * @Date 2022/4/25 15:49
 * @Description ---
 * PassportForThird
 * Modification History:
 * Date Author Version Description
 * ---------------------------------------------------------------------------------*
 * 2022/4/25 15:49 xulp v1.0.0 Created
 */
public class PassportForThird extends SignService implements IPassportForThird {
    @Override
    public ResultMsg loginForQQ(String id) {
        // 策略模式
        return this.processLogin(id, LoginForQQAdapter.class);
    }

    @Override
    public ResultMsg loginForWeChat(String id) {
        return this.processLogin(id, LoginForWeChatAdapter.class);
    }

    @Override
    public ResultMsg loginForToken(String token) {
        return this.processLogin(token, LoginForTokenAdapter.class);

    }

    @Override
    public ResultMsg loginForTelPhone(String telPhone, String code) {
        return this.processLogin(telPhone, LoginForTelAdapter.class);
    }

    @Override
    public ResultMsg loginForRegister(String username, String passport) {
        super.register(username, passport);
        return super.login(username, passport);
    }

    /**
     * 简单工厂模式
     */
    public ResultMsg processLogin(String key, Class<? extends LoginAdapter> clazz) {
        try {
            LoginAdapter adapter = clazz.newInstance();
            if (adapter.support(adapter)) {
                return adapter.login(key, adapter);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
