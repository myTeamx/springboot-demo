package com.gjxx.springbootdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author Sxs
 * @description demo
 * @date 2019/10/24 16:57
 */
@Controller
public class DemoController {

    @GetMapping("/")
    public String index() {
        return "index";
    }

}
