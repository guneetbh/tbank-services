package com.banc.accounts;

import com.banc.accounts.dto.AccountsContactInfoDto;
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
@EnableJpaAuditing(auditorAwareRef = "auditAwareImpl")
@EnableConfigurationProperties(value={AccountsContactInfoDto.class})
@OpenAPIDefinition(
		info=@Info(
				title="Accounts microservice",
				description="Account microservice REST API Documentation of TBank",
				version="v1",
				contact=@Contact(
						name = "Guneet Bhatia"
		),
				license=@License(
						name="Apache2.0",
						url= "http://guneetbhatia.com/restapi"
		)
		),
		externalDocs = @ExternalDocumentation(
				description="REST API Documentation for TBank",
				url="http://localhost:8080/swagger-ui/index.html#/"
		)
)
public class AccountsApplication {

	public static void main(String[] args) {
		SpringApplication.run(AccountsApplication.class, args);
	}

}
