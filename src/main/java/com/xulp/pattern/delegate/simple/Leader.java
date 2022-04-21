package com.xulp.pattern.delegate.simple;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description TODO
 * @Author xulp
 * @Date 2022/4/20 20:03
 */
public class Leader {
    // 预先知道每个员工的特长、特征，分发任务
    private Map<String, IEmployee> register = new HashMap<>();

    public Leader() {
        register.put("加密", new EmployeeA());
        register.put("登录", new EmployeeB());
    }
    // 项目经理自己不干活
    public void doing(String command) {
        register.get(command).doing(command);
    }
}
