package com.deepu.springframework.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
 	
public class Client {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beansConfig.xml");
		Sim sim = context.getBean("sim", Sim.class);
		sim.action();
	}
}
