package com.xulp.delegate.simple;

import java.text.MessageFormat;

/**
 * @Description TODO
 * @Author xulp
 * @Date 2022/4/20 20:05
 */
public class EmployeeB implements IEmployee {
    @Override
    public void doing(String command) {
        System.out.println(MessageFormat.format("我是员工B，我开始干活了，擅长架构，执行{0}...", command));
    }
}
