package com.dcd.swagger.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;

/**
 * 一些声明信息
 * Description:
 *
 * @author Lenovo
 * @Date 2022/3/22 14:47
 * @since JDK 1.8
 */
@Configuration
@EnableSwagger2 //开启Swagger
public class SwaggerConfig {
    @Value("${spring.profiles.active}")
    private String profiles;

    @Bean
    public Docket docket(){

        boolean config_env = profiles.equals("dev");

        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo_myself())
                .select()
                //RequestHandlerSelectors 配置要扫描接口的方式
                //basePackage() 指定要扫描的包
                //any() 扫描全部
                //none() 都不扫描
                //withClassAnnotation() 扫描类上的注解
                //withMethodAnnotation() 扫描类上的注解
                .apis(RequestHandlerSelectors.basePackage("com.dcd.swagger.controller"))
                //path() 过滤扫描的路径
                //.paths(PathSelectors.ant("/dcd/*"))
                .build()
                .enable(config_env);
    }

    //配置Swagger信息
    private ApiInfo apiInfo_myself(){
        //作者信息
        Contact contact = new Contact("MrDecadent", "null", "353562631@qq.com");

        return new ApiInfo("MrDecadent_Swagger"
                ,"一小时通关家人们"
                ,"V1.0"
                ,"http://localhost:8080"
                , contact
                , "Apache2.0"
                , "http://www.apache.org/licenses/LICENSE-2.0"
                ,new ArrayList());
    }
}
