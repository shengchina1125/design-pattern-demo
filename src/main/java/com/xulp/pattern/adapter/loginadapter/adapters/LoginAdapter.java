package com.xulp.pattern.adapter.loginadapter.adapters;

import com.xulp.pattern.adapter.loginadapter.ResultMsg;

/**
 * @author xulp
 * @version v1.0.0
 * @Date 2022/4/25 15:50
 * @Description 在适配器里面，这个接口是可有可无，不要跟模板模式混淆
 * 模板模式一定是抽象类，这里仅仅只是一个接口
 * LoginAdapter
 * Modification History:
 * Date Author Version Description
 * ---------------------------------------------------------------------------------*
 * 2022/4/25 15:50 xulp v1.0.0 Created
 */
public interface LoginAdapter {

    boolean support(Object adapter);

    ResultMsg login(String id, Object adapter);
}
