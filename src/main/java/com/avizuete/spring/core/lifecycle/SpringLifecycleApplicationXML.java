package com.avizuete.spring.core.lifecycle;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.avizuete.spring.core.lifecycle.beans.LifecycleBean;

public class SpringLifecycleApplicationXML {
	
	public static void main(String[] args) {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");

		LifecycleBean book = (LifecycleBean) context.getBean("myBean");
		System.out.println("11. Tiempo de ejecución del Bean, la propiedad Name es " + book.getName());
		
		context.close();
	}
}
