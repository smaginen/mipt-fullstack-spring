package com.smagin.mipt.fullstack.aspects;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.smagin.mipt.fullstack.aspects.config.AppConfig;
import com.smagin.mipt.fullstack.aspects.service.TransferService;


public class AspectDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
		TransferService transferService = applicationContext.getBean(TransferService.class);
		transferService.transfer("accountA", "accountB", 50000l);
		applicationContext.close();
	}

}
