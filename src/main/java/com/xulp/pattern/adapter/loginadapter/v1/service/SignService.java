package com.xulp.pattern.adapter.loginadapter.v1.service;


import com.xulp.pattern.adapter.loginadapter.Member;
import com.xulp.pattern.adapter.loginadapter.ResultMsg;

/**
 * Created by Tom.
 */
public class SignService {

    /**
     * 注册方法
     * @param username
     * @param password
     * @return
     */
    public ResultMsg register(String username, String password){
        return  new ResultMsg(200,"注册成功",new Member());
    }


    /**
     * 登录的方法
     * @param username
     * @param password
     * @return
     */
    public ResultMsg login(String username,String password){
        return null;
    }

}
