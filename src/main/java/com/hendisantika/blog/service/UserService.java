package com.hendisantika.blog.service;

/**
 * Created by IntelliJ IDEA.
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 8/1/17
 * Time: 5:12 PM
 * To change this template use File | Settings | File Templates.
 */
public interface UserService {
    boolean authenticate(String username, String password);
}
