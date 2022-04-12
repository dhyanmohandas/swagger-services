package com.dev.swaggerservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

@OpenAPIDefinition(info = @Info(title = "Swagger-Services"))
@SpringBootApplication
public class SwaggerServicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(SwaggerServicesApplication.class, args);
	}

}
