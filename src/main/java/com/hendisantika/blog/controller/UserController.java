package com.hendisantika.blog.controller;

import com.hendisantika.blog.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by IntelliJ IDEA.
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 8/2/17
 * Time: 8:34 AM
 * To change this template use File | Settings | File Templates.
 */

@Controller
public class UserController {
    @Autowired
    UserService us;

    @GetMapping("/users")
    public String list(Model m){
        m.addAttribute("users", us.findAll());
        return "users/list-user";
    }

}
