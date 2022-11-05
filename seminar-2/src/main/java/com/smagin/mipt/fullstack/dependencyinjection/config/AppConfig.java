package com.smagin.mipt.fullstack.dependencyinjection.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.smagin.mipt.fullstack.dependencyinjection.repository.AccountRepository;
import com.smagin.mipt.fullstack.dependencyinjection.repository.TransferRepository;
import com.smagin.mipt.fullstack.dependencyinjection.repository.jdbc.JdbcAccountRepository;
import com.smagin.mipt.fullstack.dependencyinjection.repository.jdbc.JdbcTransferRepository;
import com.smagin.mipt.fullstack.dependencyinjection.service.TransferService;
import com.smagin.mipt.fullstack.dependencyinjection.service.TransferServiceImpl;

@Configuration
@ComponentScan(basePackageClasses={TransferService.class,AccountRepository.class})
public class AppConfig {
	
	@Bean
	public TransferService transferService(){
		return new TransferServiceImpl(accountRepository(), transferRepository());
	}
	@Bean
	public AccountRepository accountRepository() {
		return new JdbcAccountRepository();
	}
	@Bean
	public TransferRepository transferRepository() {
		return new JdbcTransferRepository();
	}
}
