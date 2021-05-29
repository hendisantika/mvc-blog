package com.hendisantika.blog.controller;

import com.hendisantika.blog.form.LoginForm;
import com.hendisantika.blog.model.User;
import com.hendisantika.blog.service.LoginService;
import com.hendisantika.blog.service.NotificationService;
import com.hendisantika.blog.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

/**
 * Created by IntelliJ IDEA.
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 8/1/17
 * Time: 5:14 PM
 * To change this template use File | Settings | File Templates.
 */

@Controller
public class LoginController {
    @Autowired
    private LoginService userService;

    @Autowired
    private NotificationService notifyService;

    @Autowired
    private UserService us;

    @GetMapping("/users/login")
    public String login(LoginForm loginForm) {
        return "users/login";
    }

    @PostMapping(value = "/users/login")
    public String loginPage(@Valid LoginForm loginForm, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            notifyService.addErrorMessage("Please fill the form correctly!");
            return "users/login";
        }

        if (!userService.authenticate(
                loginForm.getUsername(), loginForm.getPassword())) {
            notifyService.addErrorMessage("Invalid login!");
            return "users/login";
        }

        notifyService.addInfoMessage("Login successful");
        return "redirect:/";
    }

    @GetMapping("/users/register")
    public String register(Model m)
    {
        m.addAttribute("user", new User());
        return "users/register";
    }

    @PostMapping("/users/register")
    public String registerPage(@Valid User user, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            notifyService.addErrorMessage("Please fill the form correctly!");
            return "users/register";
        }

        notifyService.addInfoMessage("Registration successful");

        us.create(user);

        return "redirect:/";
    }
}
