package com.draw.geometricshape;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.draw.geometricshape.*")
public class DrawGeometricShapeApplication {
	public static void main(String[] args) {
		SpringApplication.run(DrawGeometricShapeApplication.class, args);
	}
}
