package com.dcd.swagger.controller;

import com.dcd.swagger.pojo.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
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

    @GetMapping(value = "/hello")
    public String hello(){
        return "hello Swagger";
    }

    //只要接口中，返回值存在实体类，实体类就会被扫描到Swagger中
    @PostMapping("/User")
    //方法注释
    @ApiOperation("User方法")
    public User user(){
        return new User("MrDecadent","114514");
    }

    @PostMapping("/User2")
    public User user2(User user){
        return user;
    }
}
