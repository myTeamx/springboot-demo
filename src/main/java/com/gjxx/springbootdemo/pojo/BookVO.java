package com.gjxx.springbootdemo.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author Sxs
 * @description book vo
 * @date 2019/10/29 11:25
 */
@Data
@AllArgsConstructor
public class BookVO {

    private String id;

    private String name;

    private Integer price;

}
