package com.avizuete.spring.core.lifecycle.beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanClassLoaderAware;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class LifecycleBean implements InitializingBean, DisposableBean, BeanFactoryAware, BeanNameAware, BeanClassLoaderAware {
	
	
	private String origen;
	
	public LifecycleBean() {
		System.out.println("1. LifecycleBean Constructor");
	}
	
	public String getOrigen() {
		return origen;
	}
	
	@Value("${com.avizuete.lifecycle.bean.origen}")
	public void setOrigen(String origen) {
		this.origen = origen;
		System.out.println("2. LifecycleBean Setters");		
	}
		
	@Override
	public void setBeanName(String name) {
   	       System.out.println("3. LifecycleBean BeanNameAware.setBeanName("+name+")");
	}
	
	@Override
	public void setBeanClassLoader(ClassLoader classLoader) {
	       System.out.println("4. LifecycleBean BeanClassLoaderAware.setBeanClassLoader("+classLoader+")");
	}
	
	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		System.out.println("5. LifecycleBean BeanFactoryAware.setBeanFactory("+beanFactory+")");
	}
	
	@PostConstruct
	public void springPostConstruct() {
	    System.out.println("7. LifecycleBean @PostConstruct");
	}
	
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("8. LifecycleBean InitializingBean.afterPropertiesSet()");
	}
	
	public void myPostConstruct() {
		System.out.println("9. LifecycleBean XML-Config init-method");
	}	
	
	@PreDestroy
	public void springPreDestroy() {
		System.out.println("12. LifecycleBean @PreDestroy");
	}
	
	@Override
	public void destroy() throws Exception {
		System.out.println("13. LifecycleBean DisposableBean.destroy");
	}
	
	public void myPreDestroy() {
		System.out.println("14. LifecycleBean XML-Config destroy-method");
	}
	
	@Override
	protected void finalize() {
		System.out.println("15. LifecycleBean Object.finalize");
	}
}
