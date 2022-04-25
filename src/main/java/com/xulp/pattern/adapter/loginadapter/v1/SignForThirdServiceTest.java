package com.xulp.pattern.adapter.loginadapter.v1;


import com.xulp.pattern.adapter.loginadapter.v1.service.SignForThirdService;

/**
 * Created by Tom on 2019/3/16.
 */
public class SignForThirdServiceTest {
    public static void main(String[] args) {
        SignForThirdService signForThirdService = new SignForThirdService();
        signForThirdService.login("xulp", "123456");
        signForThirdService.loginForQQ("ssssssssss");
        signForThirdService.loginForWechat("sdsdadasdasd");
    }
}
