package com.genekuo.cqrs.connectionposts;

import com.genekuo.cqrs.connectionposts.config.ConnectionPostsApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;


public class ServletInitializer extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(ConnectionPostsApplication.class);
	}

}
