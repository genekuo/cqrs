package com.genekuo.cqrs.connections;

import com.genekuo.cqrs.connections.config.ConnectionsApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

public class ServletInitializer extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(ConnectionsApplication.class);
	}

}
