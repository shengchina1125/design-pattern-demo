package com.xulp.pattern.template.jdbc.dao;

import com.xulp.pattern.template.jdbc.JdbcTemplate;
import com.xulp.pattern.template.jdbc.RowMapper;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.util.List;

/**
 * @author xulp
 * @version v1.0.0
 * @Date 2022/4/22 16:56
 * @Description ---
 * MemberDao
 * Modification History:
 * Date Author Version Description
 * ---------------------------------------------------------------------------------*
 * 2022/4/22 16:56 xulp v1.0.0 Created
 */
public class MemberDao extends JdbcTemplate {

    public MemberDao(DataSource dataSource) {
        super(dataSource);
    }

    public List<?> selectAll() {
        String sql = "select * from t_member";

      return super.executeQuery(sql, new RowMapper<Member>() {
            @Override
            public Member mapRow(ResultSet resultSet, int rowNum) throws Exception {
                Member member = new Member();
                // 字段过多，原型模式
                member.setUsername(resultSet.getString("username"));
                member.setPassword(resultSet.getString("password"));
                member.setNickname(resultSet.getString("nickname"));
                member.setAge(resultSet.getInt("age"));
                member.setAddress(resultSet.getString("address"));
                return member;
            }
        }, null);
    }
}
