package com.spring.test.beanDefinitionRegistrar;

import com.spring.test1.MyRegistrarBean;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;
import org.springframework.stereotype.Service;

/**
 * @Description:
 * @Author: zzp
 * @Date: 2024/10/25 11:03
 */
public class MyImportBeanDefinitionRegistrar implements ImportBeanDefinitionRegistrar {

	public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
		System.out.println("MyImportBeanDefinitionRegistrar方法执行");

		// 创建一个RootBeanDefinition
		RootBeanDefinition beanDefinition = new RootBeanDefinition(MyRegistrarBean.class);
		beanDefinition.getPropertyValues().add("name", "MyRegistrarBean");

		// 注册BeanDefinition到BeanFactory
		registry.registerBeanDefinition("MyRegistrarBean", beanDefinition);
	}

}
