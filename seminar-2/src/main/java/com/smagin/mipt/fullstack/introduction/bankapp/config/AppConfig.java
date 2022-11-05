package com.smagin.mipt.fullstack.introduction.bankapp.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import com.smagin.mipt.fullstack.introduction.bankapp.aspect.LoggingAspect;
import com.smagin.mipt.fullstack.introduction.bankapp.repository.AccountRepository;
import com.smagin.mipt.fullstack.introduction.bankapp.repository.TransferRepository;
import com.smagin.mipt.fullstack.introduction.bankapp.repository.jdbc.JdbcAccountRepository;
import com.smagin.mipt.fullstack.introduction.bankapp.repository.jdbc.JdbcTransferRepository;
import com.smagin.mipt.fullstack.introduction.bankapp.service.TransferService;
import com.smagin.mipt.fullstack.introduction.bankapp.service.TransferServiceImpl;

@Configuration
@EnableAspectJAutoProxy
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
	@Bean
	public LoggingAspect loggingAspect() {
		return new LoggingAspect();
	}
}
