package com.spring.test;/**
 * @Author zzp
 * @Date 2023/7/17
 */

import com.spring.test.beanDefinitionRegistrar.MyImportBeanDefinitionRegistrar;
import com.spring.test.service.UserServiceImpl;
import com.spring.test1.MyRegistrarBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @Description:
 * @Author: zzp
 * @Date: 2023/7/17 11:21
 */
@Configuration
@Import(value = MyImportBeanDefinitionRegistrar.class)
//@ComponentScan("com.spring.test")
public class SpringMainTest {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext("com.spring.test");
		MyRegistrarBean bean = (MyRegistrarBean) context.getBean("MyRegistrarBean");
		bean.test();
	}


	/* public static void main(String[] args) {
	 ApplicationContext context=new AnnotationConfigApplicationContext(SpringMainTest.class);
	 EnhanceClass bean = context.getBean(EnhanceClass.class);
	 bean.enhance();
	 }*/

}
