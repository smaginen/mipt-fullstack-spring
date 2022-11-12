package com.smagin.mipt.fullstack.introduction.bankapp.config;

import org.springframework.beans.factory.annotation.Qualifier;
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
import org.springframework.context.annotation.Scope;

@Configuration
@EnableAspectJAutoProxy
public class AppConfig {
    @Bean
    public TransferService transferService(@Qualifier("accountRepository2") AccountRepository accountRepository,
										   TransferRepository transferRepository) {
        return new TransferServiceImpl(accountRepository, transferRepository);
    }

    @Bean
	@Qualifier("accountRepository1")
    public AccountRepository accountRepository1() {
        return new JdbcAccountRepository();
    }

    @Bean
	@Qualifier("accountRepository2")
	public AccountRepository accountRepository2() {
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
