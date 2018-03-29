package com.avizuete.spring.core.lifecycle.config;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

import com.avizuete.spring.core.lifecycle.beans.LifecycleBean;

@Component
public class MyBeanPostProcessor implements BeanPostProcessor {

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		if (bean instanceof LifecycleBean) {
			System.out.println("6. MyBeanPostProcessor BeanPostProcessor.postProcessBeforeInitialization(" + bean + ", "
					+ beanName + ")");
		}
		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		if (bean instanceof LifecycleBean) {
			System.out.println("10. MyBeanPostProcessor BeanPostProcessor.postProcessAfterInitialization(" + bean + ", "
					+ beanName + ")");
		}
		return bean;
	}
}