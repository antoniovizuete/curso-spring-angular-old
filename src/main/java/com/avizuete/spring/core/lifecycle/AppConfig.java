package com.avizuete.spring.core.lifecycle;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.avizuete.spring.core.lifecycle.beans.LifecycleBean;

@Configuration
public class AppConfig {
	
	@Bean(name = "myBean")
	public LifecycleBean getBean() {
		LifecycleBean bean = new LifecycleBean();
		bean.setName("Nombre");
		return bean;
	}
}
