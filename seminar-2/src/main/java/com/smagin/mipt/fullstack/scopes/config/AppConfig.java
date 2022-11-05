package com.smagin.mipt.fullstack.scopes.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.smagin.mipt.fullstack.scopes.repository.AccountRepository;
import com.smagin.mipt.fullstack.scopes.repository.JdbcAccountRepository;


@Configuration
@ComponentScan("com.smagin.mipt.fullstack.scopes")
public class AppConfig {
	@Bean(initMethod = "populateCache")
	public AccountRepository accountRepository(){
		return new JdbcAccountRepository();
	}
}
