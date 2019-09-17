package com.gjxx.springbootdemo.pojo;

import com.gjxx.springbootdemo.enumeration.SexEnum;
import lombok.Data;

import java.util.Date;

/**
 * @Description 用户
 * @Author Sxs
 * @Date 2019/9/17 17:49
 * @Version 1.0
 */
@Data
public class User {

    private String id;

    private String ip;

    private String randomName;

    private SexEnum sex;

    private String live;

    private Date createtime;

    private Date updatetime;

}
