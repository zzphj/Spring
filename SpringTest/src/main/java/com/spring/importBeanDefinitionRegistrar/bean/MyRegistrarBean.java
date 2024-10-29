package com.spring.importBeanDefinitionRegistrar.bean;

/**
 * @Description:
 * @Author: zzp
 * @Date: 2024/10/25 11:38
 */
public class MyRegistrarBean 
{
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void test() {
		System.out.println(name +"我在Spring容器中啦，哈哈哈哈");
	}
}
