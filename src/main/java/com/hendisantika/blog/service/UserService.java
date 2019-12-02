package com.hendisantika.blog.service;

import com.hendisantika.blog.model.User;

import java.util.List;
import java.util.Optional;

/**
 * Created by IntelliJ IDEA.
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 8/1/17
 * Time: 6:36 PM
 * To change this template use File | Settings | File Templates.
 */
public interface UserService {
    List<User> findAll();

    Optional<User> findById(Long id);

    User create(User user);
    User edit(User user);
    void deleteById(Long id);
}
