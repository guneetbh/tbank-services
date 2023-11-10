package com.banc.loans;

import com.banc.loans.dto.LoansContactInfoDto;
import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
/*@ComponentScans({ @ComponentScan("com.banc.loans.controller") })
@EnableJpaRepositories("com.banc.loans.repository")
@EntityScan("com.banc.loans.model")*/
@EnableConfigurationProperties(value= LoansContactInfoDto.class)
@EnableJpaAuditing(auditorAwareRef = "auditAwareImpl")
@OpenAPIDefinition(
		info = @Info(
				title = "Loans microservice REST API Documentation",
				description = "TBank Loans microservice REST API Documentation",
				version = "v1",
				contact = @Contact(
						name = "Guneet Bhatia",
						email = "test@test.com",
						url = "https://www.tbanc.com"
				),
				license = @License(
						name = "Apache 2.0",
						url = "https://www.tbanc.com"
				)
		),
		externalDocs = @ExternalDocumentation(
				description = "TBank Loans microservice REST API Documentation",
				url = "https://www.localhost:8080/swagger-ui.html"
		)
)
public class LoansApplication {

	public static void main(String[] args) {
		SpringApplication.run(LoansApplication.class, args);
	}
}
