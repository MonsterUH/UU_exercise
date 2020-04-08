package com.spring.test;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.pojo.Users;

public class SpringTest {

	@Test
	public void getVoid() {
		//1.������������
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		//2.����������bean����
		Users bean = (Users) context.getBean("users");
		System.out.println("bean: " + bean);
	}
}
