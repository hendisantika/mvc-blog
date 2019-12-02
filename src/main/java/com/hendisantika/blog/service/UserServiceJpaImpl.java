package com.hendisantika.blog.service;

import com.hendisantika.blog.model.User;
import com.hendisantika.blog.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * Created by IntelliJ IDEA.
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 8/1/17
 * Time: 6:25 PM
 * To change this template use File | Settings | File Templates.
 */

@Service
@Primary
public class UserServiceJpaImpl implements UserService {
    @Autowired
    private UserRepository userRepo;

    @Override
    public List<User> findAll() {
        return this.userRepo.findAll();
    }

    @Override
    public Optional<User> findById(Long id) {
        return this.userRepo.findById(id);
    }

    @Override
    public User create(User user) {
        return this.userRepo.save(user);
    }
    @Override
    public User edit(User user) {
        return this.userRepo.save(user);
    }
    @Override
    public void deleteById(Long id) {
        this.userRepo.deleteById(id);
    }

}
