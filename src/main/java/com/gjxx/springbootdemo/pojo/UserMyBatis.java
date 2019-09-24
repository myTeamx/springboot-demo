package com.gjxx.springbootdemo.pojo;

import com.gjxx.springbootdemo.enumeration.SexEnum;
import lombok.Data;
import org.apache.ibatis.type.Alias;

import java.util.Date;

/**
 * @Description user
 * @Author Sxs
 * @Date 2019/9/23 11:42
 * @Version 1.0
 */
@Data
@Alias(value = "user")
public class UserMyBatis {

    private String id;

    private String ip;

    private String randomName;

    private SexEnum sex;

    private String live;

    private Date createtime;

    private Date updatetime;

}
