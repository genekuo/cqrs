package com.genekuo.cqrs.connections.domain;

import org.springframework.data.repository.CrudRepository;

/**
 * Created by genekuo on 18/10/19.
 */
public interface UserRepository extends CrudRepository<User, Long> {

    User findByUsername(String username);
}
