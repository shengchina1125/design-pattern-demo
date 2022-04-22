package com.xulp.pattern.template.jdbc.dao;

import java.util.List;

/**
 * @author xulp
 * @version v1.0.0
 * @Date 2022/4/22 17:05
 * @Description ---
 * MemberDaoTest
 * Modification History:
 * Date Author Version Description
 * ---------------------------------------------------------------------------------*
 * 2022/4/22 17:05 xulp v1.0.0 Created
 */
public class MemberDaoTest {

    public static void main(String[] args) {
        MemberDao memberDao = new MemberDao(null);
        List<?> result = memberDao.selectAll();
        System.out.println(result);
    }
}
