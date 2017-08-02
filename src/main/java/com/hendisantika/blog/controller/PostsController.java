package com.hendisantika.blog.controller;

import com.hendisantika.blog.model.Post;
import com.hendisantika.blog.service.NotificationService;
import com.hendisantika.blog.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

/**
 * Created by IntelliJ IDEA.
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 8/1/17
 * Time: 4:57 PM
 * To change this template use File | Settings | File Templates.
 */

@Controller
@RequestMapping("/posts")
public class PostsController {
    @Autowired
    private PostService postService;

    @Autowired
    private NotificationService notifyService;

    @RequestMapping("/view/{id}")
    public String view(@PathVariable("id") Long id, Model model) {
        Post post = postService.findById(id);

        if (post == null) {
            notifyService.addErrorMessage("Cannot find post #" + id);
            return "redirect:/";
        }
        model.addAttribute("post", post);
        return "posts/view";
    }

    @GetMapping("")
    public String list(Model m) {
        m.addAttribute("posts", postService.findAll());
        return "posts/list";
    }


    @GetMapping("/create")
    public String showFormPost(Model m) {
        m.addAttribute("post", new Post());
        return "posts/new-post";
    }

    @PostMapping("/create")
    public String createPost(@Valid Post post) {
        System.out.println("Data : " + post);
        postService.create(post);
        return "redirect:list";
    }

    @GetMapping("/edit{id}")
    public String editPost(@RequestParam Long id, Model m) {
        Post post = postService.findById(id);
        m.addAttribute("posts", post);
        return "posts/edit";
    }
}
