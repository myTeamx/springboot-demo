package com.gjxx.springbootdemo.controller;

import com.gjxx.springbootdemo.pojo.BookVO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Sxs
 * @description vue页面测试接口
 * @date 2019/10/29 11:24
 */
@RestController
@RequestMapping("/vue_test")
public class VueTestController {

    @GetMapping("/getBooks")
    public List<BookVO> getBooks() {

        List<BookVO> books = new ArrayList<>();
        books.add(new BookVO("001", "xxx", 22));
        books.add(new BookVO("002", "yyy", 20));
        books.add(new BookVO("003", "zzz", 21));
        books.add(new BookVO("004", "三体Ⅰ", 50));
        books.add(new BookVO("005", "三体Ⅱ", 60));

        return books;
    }

}
