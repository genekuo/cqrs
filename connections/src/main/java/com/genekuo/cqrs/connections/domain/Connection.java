package com.genekuo.cqrs.connections.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by genekuo on 28/10/19.
 */
@Entity
public class Connection {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    private Long follower;
    private Long followed;

    protected Connection() {

    }

    public Connection(Long follower, Long followed) {
        this.follower = follower;
        this.followed = followed;
    }

    public Long getId() {
        return id;
    }

    public Long getFollower() {
        return follower;
    }

   public Long getFollowed() {
        return followed;
    }
}
