package com.smagin.mipt.fullstack.factorybean.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.smagin.mipt.fullstack.factorybean.repository.AccountRepositoryFactoryBean;
import com.smagin.mipt.fullstack.factorybean.service.TransferService;


@Configuration
public class AppConfig {
	@Bean
	public TransferService transferService(AccountRepositoryFactoryBean bean) throws Exception{
		return new TransferService(bean.getObject());
	}
	@Bean
	public AccountRepositoryFactoryBean accountRepository(){
		return new AccountRepositoryFactoryBean();
	}
}
