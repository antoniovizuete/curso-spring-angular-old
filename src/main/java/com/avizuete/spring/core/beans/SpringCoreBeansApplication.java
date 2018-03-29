package com.avizuete.spring.core.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.avizuete.spring.core.beans.bean.PrototypeBean;
import com.avizuete.spring.core.beans.bean.SingletonBean;

@SpringBootApplication
public class SpringCoreBeansApplication implements CommandLineRunner {
	@Autowired
	private ApplicationContext context;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringCoreBeansApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		PrototypeBean prototypeBean1 = context.getBean(PrototypeBean.class);
		prototypeBean1.setId(1);
				
		PrototypeBean prototypeBean2 = context.getBean(PrototypeBean.class);
		prototypeBean2.setId(2);
		
		System.out.println(prototypeBean2);
		System.out.println(prototypeBean1);
		
		SingletonBean singletonBean1 = context.getBean(SingletonBean.class);		
		singletonBean1.setId(1);
				
		SingletonBean singletonBean2 = context.getBean(SingletonBean.class);		
		singletonBean2.setId(2);
		
		System.out.println(singletonBean2);
		System.out.println(singletonBean1);
		
	}
	
	
}
