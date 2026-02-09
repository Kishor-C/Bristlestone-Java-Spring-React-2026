package com.example;

import org.springframework.jdbc.core.JdbcTemplate;

public class EmployeeDao {
	
	private JdbcTemplate template;
	/*
	 * Spring supplies JdbcTemplate object using
	 * the XML configuration file
	 * <property name = "template" ref = "jdbc">
	 */
	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}
	/*
	 * takes employee object having id, name, salary and
	 * stores it in the employee table
	 * the order of the parameter maps to the order of the ?
	 * update() returns int -> how many rows affected
	 */
	
	public int save(Employee emp) {
		String query = "insert into employee values(?,?,?)";
		int status = template.update(query, emp.getId(), emp.getName(), emp.getSalary());
		return status;
	}
	/*
	 * delete query that takes id 
	 * and deletes the record
	 */
	public boolean deleteById(int id) {
		int status = template.update("delete from employee where id = ?", id);
		return status > 0; // true if > 0 else false
	}
	
}
