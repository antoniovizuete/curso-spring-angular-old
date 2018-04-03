package com.avizuete.spring.core.lifecycle;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.avizuete.spring.core.lifecycle.beans.LifecycleBean;

public class SpringLifecycleApplicationJavaConfig {
	
	public static void main(String[] args) {
		ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		
		LifecycleBean book = (LifecycleBean) context.getBean("myBean");
		System.out.println("11. Tiempo de ejecución del Bean, la propiedad Origen es " + book.getOrigen());
		
		context.close();
	}
}
