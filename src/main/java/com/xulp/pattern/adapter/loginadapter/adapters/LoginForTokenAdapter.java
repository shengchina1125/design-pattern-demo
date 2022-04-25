package com.xulp.pattern.adapter.loginadapter.adapters;

import com.xulp.pattern.adapter.loginadapter.ResultMsg;

/**
 * @author xulp
 * @version v1.0.0
 * @Date 2022/4/25 15:53
 * @Description ---
 * LoginForQQAdapter
 * Modification History:
 * Date Author Version Description
 * ---------------------------------------------------------------------------------*
 * 2022/4/25 15:53 xulp v1.0.0 Created
 */
public class LoginForTokenAdapter implements LoginAdapter {
    @Override
    public boolean support(Object adapter) {
        return adapter instanceof LoginForTokenAdapter;
    }

    @Override
    public ResultMsg login(String id, Object adapter) {
        return null;
    }
}
