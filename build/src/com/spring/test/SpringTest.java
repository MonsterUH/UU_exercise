package com.spring.test;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.pojo.Users;

public class SpringTest {

	@Test
	public void getVoid() {
		//1.创建容器对象
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		//2.在容器中找bean对象
		Users bean = (Users) context.getBean("users");
		System.out.println("bean: " + bean);
	}
}
