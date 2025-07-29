package com.example.cards;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing(auditorAwareRef = "auditAwareImpl")
@OpenAPIDefinition(info = @Info(
		title = "Cards Microservice REST API Documentation",
		description = "EazyBank Cards Microservice REST API Documentation",
		version = "v1",
		contact = @Contact(
				name = "Ankit Bisen",
				email = "bisenankit21@gmail.com",
				url = "https://github.com/ankitbisen"
		),
		license = @License(
				name="Apache2.0",
				url = "https://github.com/ankitbisen"
		)
),
		externalDocs = @ExternalDocumentation(
				description = "EazyBank Cards Microservice REST API Documentation0",
				url = "http://localhost:9000/swagger-ui/index.html"
		)
)
public class CardsApplication {

	public static void main(String[] args) {
		SpringApplication.run(CardsApplication.class, args);
	}

}
