package com.avizuete.spring.core.lifecycle;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

import com.avizuete.spring.core.lifecycle.beans.LifecycleBean;

@Configuration
@ComponentScan
@PropertySource({"classpath:application.properties"})
public class AppConfig {
	
	@Bean
	public PropertySourcesPlaceholderConfigurer propertyPlaceholderConfigurer() {
		return new PropertySourcesPlaceholderConfigurer();
	}
	
	@Bean
	@Condi
	public LifecycleBean myBean() {
		LifecycleBean lb = new LifecycleBean();
		lb.setOrigen("JavaConfig");
		return lb;
	}
	
}
