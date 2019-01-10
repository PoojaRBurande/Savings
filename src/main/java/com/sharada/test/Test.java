package com.sharada.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sharada.controllers.Employee;
import com.sharada.shape.Shape;

public class Test { 

	public static void main(String[] args) {
		ApplicationContext applicationContext=new 
				ClassPathXmlApplicationContext("applicationContext.xml");
		Employee e1=(Employee) applicationContext.getBean("empId");
		System.out.println(e1.toString());
		/*Employee e01=(Employee) applicationContext.getBean("empId1");
		System.out.println(e01.toString());*/
		Employee e02=(Employee) applicationContext.getBean("empId");
		System.out.println(e02.toString());
		//System.out.println(e1==e01);
		System.out.println(e1==e02);
		
		Shape c=(Shape) applicationContext.getBean("circle");
		Shape t=(Shape) applicationContext.getBean("triangle");
		Shape r=(Shape) applicationContext.getBean("rectangle");
		c.draw();
		t.draw();
		r.draw();
		
		Shape r1=(Shape) applicationContext.getBean("rectangle");
		r1.draw();
		
		System.out.println(r==r1);
	}

}
