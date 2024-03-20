package com.spring.test.service;

import org.springframework.stereotype.Service;

/**
 * @auther ccb
 * 2021/1/27 10:47
 * @Slogan: 可以写不出一行高深的代码，但是写出的每一行代码必须规范
 * @描述:
 */
@Service("userServiceImpl")
public class UserServiceImpl {
	public void sayHello(){
		System.out.println("你好呀spring！");
	}
}

