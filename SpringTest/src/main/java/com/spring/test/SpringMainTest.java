package com.spring.test;/**
 * @Author zzp
 * @Date 2023/7/17
 */

import com.spring.test.service.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @Description:
 * @Author: zzp
 * @Date: 2023/7/17 11:21
 */
@Configuration
@ComponentScan("com.spring.test")
public class SpringMainTest {
	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext(SpringMainTest.class);
		UserServiceImpl bean = (UserServiceImpl) context.getBean("userServiceImpl");
		bean.sayHello();
	}


	/* public static void main(String[] args) {
	 ApplicationContext context=new AnnotationConfigApplicationContext(SpringMainTest.class);
	 EnhanceClass bean = context.getBean(EnhanceClass.class);
	 bean.enhance();
	 }*/

}
