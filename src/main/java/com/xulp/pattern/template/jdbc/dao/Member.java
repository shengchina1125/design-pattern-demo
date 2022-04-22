package com.xulp.pattern.template.jdbc.dao;

/**
 * @author xulp
 * @version v1.0.0
 * @Date 2022/4/22 16:54
 * @Description ---
 * Member
 * Modification History:
 * Date Author Version Description
 * ---------------------------------------------------------------------------------*
 * 2022/4/22 16:54 xulp v1.0.0 Created
 */
public class Member {

    private String username;
    private String password;
    private String nickname;
    private int age;
    private String address;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
