package com.smagin.mipt.fullstack.dependencyinjection;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.smagin.mipt.fullstack.dependencyinjection.config.AppConfig;
import com.smagin.mipt.fullstack.dependencyinjection.model.Amount;
import com.smagin.mipt.fullstack.dependencyinjection.service.TransferService;

public class TransferMain {

	public static void main(String[] args) {
		//Load Spring context
		ConfigurableApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
		//Get TransferService bean
		TransferService transferService = applicationContext.getBean(TransferService.class);
		//Use transfer method
		transferService.transferAmmount(100l, 200l, new Amount(2000.0));
		applicationContext.close();
	}

}
