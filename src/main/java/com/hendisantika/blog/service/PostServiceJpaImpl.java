package com.hendisantika.blog.service;

import com.hendisantika.blog.model.Post;
import com.hendisantika.blog.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * Created by IntelliJ IDEA.
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 8/1/17
 * Time: 6:22 PM
 * To change this template use File | Settings | File Templates.
 */
@Service
@Primary
public class PostServiceJpaImpl implements PostService{
    @Autowired
    private PostRepository postRepo;

    @Override
    public List<Post> findAll() {
        return this.postRepo.findAll();
    }

    @Override
    public List<Post> findLatest5() {
        return this.postRepo.findLatest5Posts(PageRequest.of(0, 5));
    }

    @Override
    public Post findById(Long id) {
        Optional<Post> post = this.postRepo.findById(id);
        return post.get();
    }

    @Override
    public Post create(Post post) {
        return this.postRepo.save(post);
    }

    @Override
    public Post edit(Post post) {
        return this.postRepo.save(post);
    }

    @Override
    public void deleteById(Long id) {
        this.postRepo.deleteById(id);
    }
}
