package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		
		EmployeeDao dao = (EmployeeDao)ctx.getBean("dao");
		
		// insert 3 employee records and delete 1
		Employee employee1 = new Employee(100, "Alex1", 45000);
		Employee employee2= new Employee(200, "Alex2", 55000);
		Employee employee3 = new Employee(300, "Alex3", 65000);
		
		int status = dao.save(employee1);
		status += dao.save(employee2);
		status += dao.save(employee3);
		System.out.println(status+" rows affected");
		
		boolean flag = dao.deleteById(300);
		if(flag) {
			System.out.println("Employee deleted...");
		} else {
			System.out.println("Employee not found...");
		}
	}
}
