package com.xulp.delegate.simple;

import java.text.MessageFormat;

/**
 * @Description TODO
 * @Author xulp
 * @Date 2022/4/20 20:05
 */
public class EmployeeA implements IEmployee {
    @Override
    public void doing(String command) {
        System.out.println(MessageFormat.format("我是员工A，我开始干活了，擅长加密，执行{0}...", command));
    }
}
