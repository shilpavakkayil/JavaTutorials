package com.shilpa.quickstart;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
    	Car car = (Car)context.getBean("car");
    	//vehicle.drive();
		/* System.out.println(vehicle); */
    	car.drive();
    }
}
