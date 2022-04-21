package com.xulp.pattern.delegate.simple;

/**
 * @Description TODO
 * @Author xulp
 * @Date 2022/4/20 20:26
 */
public class DelegateTest {
    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.doing("架构", new Leader());
        boss.doing("加密", new Leader()   );
    }
}
