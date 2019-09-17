package com.gjxx.springbootdemo.service;

import com.gjxx.springbootdemo.pojo.User;

import java.util.List;

/**
 * @Description 用户service
 * @Author Sxs
 * @Date 2019/9/17 17:59
 * @Version 1.0
 */
public interface JdbcTmplUserService {

    User getUser(String id);

    List<User> findUsers(String randomName, String live);

    int insertUser(User user);

    int updateUser(User user);

    int deleteUser(String id);

}
