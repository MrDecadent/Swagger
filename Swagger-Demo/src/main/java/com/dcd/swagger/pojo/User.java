package com.dcd.swagger.pojo;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiOperation;

/**
 * 一些声明信息
 * Description:
 *
 * @author Lenovo
 * @Date 2022/3/25 15:43
 * @since JDK 1.8
 */
//类注释
@Api(tags = "Hello控制类")
@ApiModel("用户实体类")
public class User {

    @ApiModelProperty("用户名")
    public String username;
    @ApiModelProperty("用户密码")
    public String password;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
