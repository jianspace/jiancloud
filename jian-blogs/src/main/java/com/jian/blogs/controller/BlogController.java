package com.jian.blogs.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author JSY
 * @description
 * @date 2019/12/31 14:14
 */
@RestController
@RequestMapping("blog")
public class BlogController {
    @GetMapping("")
    public String helloJian(){
        return "hello 2020";
    }

}
