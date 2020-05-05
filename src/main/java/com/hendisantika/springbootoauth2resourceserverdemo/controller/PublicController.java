package com.hendisantika.springbootoauth2resourceserverdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.time.LocalDateTime;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-oauth2-resource-server-demo
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 06/05/20
 * Time: 06.35
 */
@Controller
@RequestMapping("public")
public class PublicController {

    @GetMapping("/welcome")
    public @ResponseBody
    String getGreeting() {
        return "Hey Good Day! " + LocalDateTime.now();
    }

}
