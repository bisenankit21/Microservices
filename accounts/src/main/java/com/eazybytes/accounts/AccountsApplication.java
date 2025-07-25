package com.eazybytes.accounts;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import java.io.Serializable;

@SpringBootApplication
@EnableJpaAuditing(auditorAwareRef = "auditAwareImpl")  //Enable JPA Auditing
public class AccountsApplication{
	public static void main(String[] args) {
		SpringApplication.run(AccountsApplication.class, args);
	}

}
