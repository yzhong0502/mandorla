package com.mandorla.controller;

import com.mandorla.result.Result;
import com.mandorla.pojo.User;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.HtmlUtils;


import java.util.Objects;

@Controller
public class LoginController {

    @CrossOrigin
    @PostMapping(value = "api/login") //即为把前端js post过来的页面与该方法绑定，即该方法接收到的参数就是post过来的内容
    @ResponseBody
    public Result login(@RequestBody User requestUser) {
        // 对 html 标签进行转义，防止 XSS 攻击
        String username = requestUser.getUsername();
        username = HtmlUtils.htmlEscape(username);

        if (!Objects.equals("admin", username) || !Objects.equals("123456", requestUser.getPassword())) {
            String message = "账号密码错误";
            System.out.println("test");
            return new Result(400);
        } else {
            return new Result(200);
        }
    }
}

