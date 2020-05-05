package com.hendisantika.springbootoauth2resourceserverdemo.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.oauth2.provider.OAuth2Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-oauth2-resource-server-demo
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 06/05/20
 * Time: 06.34
 */
@Controller
@RequestMapping("user")
public class UserController {

    @RequestMapping("/profile")
    @PreAuthorize("#oauth2.hasAnyScope('read')")
    public @ResponseBody
    String getOauth2Principal(OAuth2Authentication auth) {
        return "Access granted for " + auth.getPrincipal();
    }
}
