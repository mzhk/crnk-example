package io.crnk.example.service;

import io.crnk.example.service.domain.repository.SecretRepositoryImpl;
import io.crnk.example.service.domain.repository.VoteRepositoryImpl;
import io.crnk.example.service.security.LoginRepository;
import io.crnk.spring.boot.v3.CrnkConfigV3;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.web.bind.annotation.RestController;

@Configuration
@RestController
@EnableAutoConfiguration
@ComponentScan("io.crnk.example.service")
@Import({ CrnkConfigV3.class, ExampleJpaModuleConfigurer.class })
public class RepositoryConfiguration {

	@Bean
	public VoteRepositoryImpl voteRepository() {
		return new VoteRepositoryImpl();
	}

	@Bean
	public SecretRepositoryImpl secretRepository() {
		return new SecretRepositoryImpl();
	}

	@Bean
	public LoginRepository loginRepository() {
		return new LoginRepository();
	}
}
