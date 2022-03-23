package com.dcd.swagger.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 一些声明信息
 * Description:
 *
 * @author Lenovo
 * @Date 2022/3/22 14:39
 * @since JDK 1.8
 */
@RestController
public class HelloController {

    @RequestMapping(value = "/hello")
    public String hello(){
        return "hello Swagger";
    }
}
