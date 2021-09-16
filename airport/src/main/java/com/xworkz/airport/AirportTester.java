package com.xworkz.airport;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AirportTester {

	public static void main(String[] args) {
		

			ApplicationContext container = new ClassPathXmlApplicationContext("spring.xml");
			Airport airport = container.getBean(Airport.class);
			airport.runWay();
			airport.maintenance();
			System.out.println(airport);

		}

	}


