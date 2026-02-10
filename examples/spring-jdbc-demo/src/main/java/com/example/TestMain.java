package com.example;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		
		EmployeeDao dao = (EmployeeDao)ctx.getBean("dao");
		
		Scanner scan = new Scanner(System.in);
		int option = 0;
		do {
			System.out.println("1: Add 2: Find by Id 3: Find All 4: Update Salary by Id 5: Delete by Id 6: Exit");
			option = Integer.parseInt(scan.nextLine());
			switch(option) {
			case 1 : {
					System.out.println("Enter id, name and salary");
					int id = Integer.parseInt(scan.nextLine());
					String name = scan.nextLine();
					double salary = Double.parseDouble(scan.nextLine());
					Employee employee = new Employee(id, name, salary);
					int status = dao.save(employee);
					System.out.println("Row affected: "+status);
					break;
				}
			case 2 : {
					System.out.println("Enter id to find an employee");
					int id = Integer.parseInt(scan.nextLine());
					try {
						Employee employee = dao.findById(id);
						System.out.println(employee);
					} catch(RuntimeException e) {
						System.err.println("Employee with an id "+id+" not found");
					}
					break;
				}
			case 3 : {
					List<Employee> list = dao.findAll();
					list.forEach(emp -> System.out.println(emp));
					break;
				}
			// implement case 4 and case 5 as an activity
			case 4 : {
					System.out.println("Enter id and salary");
					int id = Integer.parseInt(scan.nextLine());
					double salary = Double.parseDouble(scan.nextLine());
					try { 
						Employee emp = dao.updateSalaryById(id, salary);
						System.out.println(emp);
					} catch(RuntimeException e) {
						System.err.println(e.getMessage());
					}
					break;					
				}
			case 5 : {
					System.out.println("Enter id to delete");
					int id = Integer.parseInt(scan.nextLine());
					boolean status = dao.deleteById(id);
					if(status) {
						System.out.println("Deleted successfully");
					} else {
						System.out.println("Employee is not deleted");
					}
					break;
				}
			}
		} while(option != 6);
		System.out.println("Thank you");
		scan.close();
		ClassPathXmlApplicationContext cptx = (ClassPathXmlApplicationContext)ctx;
		cptx.close();
	}
}
