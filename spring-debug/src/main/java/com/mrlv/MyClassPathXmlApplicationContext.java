package com.mrlv;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author mrLv
 * @date
 */
public class MyClassPathXmlApplicationContext extends ClassPathXmlApplicationContext {

	public MyClassPathXmlApplicationContext(String... configLocations){
		super(configLocations);
	}

	@Override
	protected void initPropertySources(){
		System.out.println("扩展initPropertySources");
		getEnvironment().setRequiredProperties("username");
		getEnvironment().validateRequiredProperties();
	}

	@Override
	protected void customizeBeanFactory(DefaultListableBeanFactory beanFactory) {
		super.setAllowBeanDefinitionOverriding(false);
		super.setAllowCircularReferences(false);
		super.customizeBeanFactory(beanFactory);
	}
}
