package com.xulp.pattern.delegate.simple;

/**
 * @Description TODO
 * @Author xulp
 * @Date 2022/4/20 20:03
 */
public class Boss {

    public void doing(String command, Leader leader) {
        leader.doing(command);
    }
}
