package com.hendisantika.blog.repository;

import com.hendisantika.blog.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by IntelliJ IDEA.
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 8/1/17
 * Time: 6:11 PM
 * To change this template use File | Settings | File Templates.
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long>{
}
