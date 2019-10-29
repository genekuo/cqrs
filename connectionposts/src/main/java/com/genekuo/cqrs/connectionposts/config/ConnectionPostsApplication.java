package com.genekuo.cqrs.connectionposts.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
//import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@Configuration
@EnableAutoConfiguration
@SpringBootApplication
@ComponentScan(basePackages = { "com.genekuo.cqrs.*" })
@EntityScan("com.genekuo.cqrs.*")
public class ConnectionPostsApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConnectionPostsApplication.class, args);
	}
}
