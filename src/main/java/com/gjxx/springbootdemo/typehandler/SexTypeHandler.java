package com.gjxx.springbootdemo.typehandler;

import com.gjxx.springbootdemo.enumeration.SexEnum;
import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.MappedJdbcTypes;
import org.apache.ibatis.type.MappedTypes;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Arrays;

/**
 * @Description 性别转换
 * @Author Sxs
 * @Date 2019/9/23 11:43
 * @Version 1.0
 */
// 声明JdbcTypes为整型
@MappedJdbcTypes(JdbcType.INTEGER)
// 声明JavaType为SexEnum
@MappedTypes(value = SexEnum.class)
public class SexTypeHandler extends BaseTypeHandler<SexEnum> {
    @Override
    public void setNonNullParameter(PreparedStatement preparedStatement, int i, SexEnum sexEnum, JdbcType jdbcType) throws SQLException {

    }

    /**
     * 通过列名读取性别
     * @param resultSet 一行记录
     * @param s 列名
     * @return 性别
     */
    @Override
    public SexEnum getNullableResult(ResultSet resultSet, String s) throws SQLException {
        int sex = resultSet.getInt(s);
        if (sex != 1 && sex != 2) {
            return null;
        }
        return SexEnum.getEnumById(sex);
    }

    /**
     * 通过下标读取性别
     * @param resultSet 一行记录
     * @param i 下标
     * @return 性别
     */
    @Override
    public SexEnum getNullableResult(ResultSet resultSet, int i) throws SQLException {
        int sex = resultSet.getInt(i);
        if (sex != 1 && sex != 2) {
            return null;
        }
        return SexEnum.getEnumById(sex);
    }

    /**
     * 通过存储过程读取性别
     * @param callableStatement CallableStatement
     * @param i int
     * @return 性别
     */
    @Override
    public SexEnum getNullableResult(CallableStatement callableStatement, int i) throws SQLException {
        return null;
    }

}
