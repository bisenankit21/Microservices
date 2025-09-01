package com.eazybytes.accounts;

import com.eazybytes.accounts.dto.AccountContactInfoDto;
import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import java.io.Serializable;

@SpringBootApplication
/*@ComponentScans({ @ComponentScan("com.eazybytes.accounts.controller") })
@EnableJpaRepositories("com.eazybytes.accounts.repository")
@EntityScan("com.eazybytes.accounts.model")*/
@EnableJpaAuditing(auditorAwareRef = "auditAwareImpl")  //Enable JPA Auditing
@EnableConfigurationProperties(value = {AccountContactInfoDto.class})
@OpenAPIDefinition(info = @Info(
		title = "Account Microservice REST API Documentation",
		description = "EazyBank Account Microservice REST API Documentation",
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
				description = "EazyBank Account Microservice REST API Documentation0",
				url = "http://localhost:8080/swagger-ui/index.html"
		)
)
public class AccountsApplication{
	public static void main(String[] args) {
		SpringApplication.run(AccountsApplication.class, args);
	}

}
