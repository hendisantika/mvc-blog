package com.hendisantika.blog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by IntelliJ IDEA.
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 8/1/17
 * Time: 3:23 PM
 * To change this template use File | Settings | File Templates.
 */

@Controller
public class HomeController {
    @GetMapping("/")
    public String index() {
        return "index";
    }
}
