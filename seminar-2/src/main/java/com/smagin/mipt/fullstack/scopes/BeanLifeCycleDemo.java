package com.smagin.mipt.fullstack.scopes;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.smagin.mipt.fullstack.scopes.config.AppConfig;


public class BeanLifeCycleDemo {

	public static void main(String[] args) {
		//ConfigurableApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		ConfigurableApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
		applicationContext.close();
	}
}
