package com.genekuo.cqrs.posts.domain;

import org.springframework.data.repository.CrudRepository;

/**
 * Created by genekuo on 10/28/19.
 */
public interface PostRepository extends CrudRepository<Post, Long> {

    Iterable<Post> findByUserId(Long userId);
}
