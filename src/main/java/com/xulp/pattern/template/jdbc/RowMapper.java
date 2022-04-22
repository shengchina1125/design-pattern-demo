package com.xulp.pattern.template.jdbc;

import java.sql.ResultSet;

/**
 * @author xulp
 * @version v1.0.0
 * @Date 2022/4/22 11:32
 * @Description ---
 * RowMapper
 * Modification History:
 * Date Author Version Description
 * ---------------------------------------------------------------------------------*
 * 2022/4/22 11:32 xulp v1.0.0 Created
 */
public interface RowMapper<T> {

    T mapRow(ResultSet resultSet, int rowNum) throws Exception;
}
