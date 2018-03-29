package com.avizuete.spring.core.lifecycle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.avizuete.spring.core.lifecycle.beans.LifecycleBean;

@SpringBootApplication
public class SpringLifecycleApplicationBoot implements CommandLineRunner {
	
	@Autowired
	ConfigurableApplicationContext context;
	
	@Autowired
	LifecycleBean bean;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringLifecycleApplicationBoot.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("11. Tiempo de ejecución del Bean, la propiedad Name es " + bean.getName());
	}
}
