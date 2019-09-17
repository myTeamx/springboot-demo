package com.gjxx.springbootdemo.service.impl;

import com.gjxx.springbootdemo.enumeration.SexEnum;
import com.gjxx.springbootdemo.pojo.User;
import com.gjxx.springbootdemo.service.JdbcTmplUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;

import java.sql.ResultSet;
import java.util.List;

/**
 * @Description 用户service
 * @Author Sxs
 * @Date 2019/9/17 18:02
 * @Version 1.0
 */
@Service
public class JdbcTmplUserServiceImpl implements JdbcTmplUserService {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    /**
     * 获取映射关系
     * @return 映射函数
     */
    private RowMapper<User> getUserMapper() {
        RowMapper<User> userRowMapper = (ResultSet rs, int rownum) -> {
            User user = new User();
            user.setId(rs.getString("id"));
            user.setIp(rs.getString("ip"));
            user.setRandomName(rs.getString("random_name"));
            user.setLive(rs.getString("live"));
            SexEnum sex = SexEnum.getEnumById(rs.getInt("sex"));
            user.setSex(sex);
            return user;
        };
        return userRowMapper;
    }

    @Override
    public User getUser(String id) {
        String sql = "select * from user where id=?";
        Object[] params = new Object[]{id};
        return jdbcTemplate.queryForObject(sql, params, getUserMapper());
    }

    @Override
    public List<User> findUsers(String randomName, String live) {
        return null;
    }

    @Override
    public int insertUser(User user) {
        return 0;
    }

    @Override
    public int updateUser(User user) {
        return 0;
    }

    @Override
    public int deleteUser(String id) {
        return 0;
    }
}
