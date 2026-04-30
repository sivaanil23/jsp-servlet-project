package org.jsp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {
	public static void main(String[] args) {
		ApplicationContext ap = new ClassPathXmlApplicationContext("Car.xml");
		
		Car c = ap.getBean("car",Car.class);
		System.out.println(c);
	}

}
