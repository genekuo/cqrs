package com.genekuo.cqrs.connections.domain;

import org.springframework.data.repository.CrudRepository;

/**
 * Created by genekuo on 28/10/19.
 */
public interface ConnectionRepository extends CrudRepository<Connection, Long> {

    Iterable<Connection> findByFollower(Long follower);
}
