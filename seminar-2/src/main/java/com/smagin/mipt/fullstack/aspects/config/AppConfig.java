package com.smagin.mipt.fullstack.aspects.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import com.smagin.mipt.fullstack.aspects.aspect.Auditing;


@Configuration
@EnableAspectJAutoProxy
@ComponentScan(basePackages={"com.smagin.mipt.fullstack.aspects.service"})
public class AppConfig {
	@Bean
	public Auditing auditing() {
		return new Auditing();
	}
}
