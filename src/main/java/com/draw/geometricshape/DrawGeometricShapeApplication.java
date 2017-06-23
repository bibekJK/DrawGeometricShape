package com.draw.geometricshape;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

/**
 * This class is the entry point of the web application
 * 
 * @author Bibek
 *
 */
@SpringBootApplication
@ComponentScan("com.draw.geometricshape.*")
public class DrawGeometricShapeApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(DrawGeometricShapeApplication.class, args);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(DrawGeometricShapeApplication.class);
	}

}
