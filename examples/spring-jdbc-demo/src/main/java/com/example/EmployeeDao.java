package com.example;

import java.sql.ResultSet;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

// default id will be employeeDao
@Repository("dao") // now the id will be dao
public class EmployeeDao {
	
	@Autowired
	private JdbcTemplate template;
	
	/*
	 * Nested class that will convert ResultSet to Employee object
	 * 
	 */
	public class EmployeeRowMapper implements RowMapper<Employee>{
		@Override
		public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
			return new Employee(rs.getInt("id"), rs.getString("name"), rs.getDouble("salary"));
		}
	}
	/*
	 * a method that takes id and returns employee object or throw exception if null
	 */
	/*
	 * select query to get a result based on the id
	 * RowMapper - we can create a nested class to implement RowMapper 
	 * or we can write lambda expression
	 */
	public Employee findById(int id) {
		String queryById = "select * from employee where id = ?";
		Employee emp = template.queryForObject(queryById, new EmployeeRowMapper(), id);
		return emp;
	}
	/*
	 * a method that returns all the employee rows in a List<Employee>
	 */
	public List<Employee> findAll() {
		String queryAll = "select * from employee";
		List<Employee> list = template.query(queryAll, new EmployeeRowMapper());
		return list;
	}
	/*
	 * Spring supplies JdbcTemplate object using
	 * the XML configuration file
	 * <property name = "template" ref = "jdbc">
	 */
//	public void setTemplate(JdbcTemplate template) {
//		this.template = template;
//	}
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
	/*
	 * update an employee salary based on id
	 */
	public Employee updateSalaryById(int id, double salary) {
		String updateQuery = "update employee set salary = ? where id = ?";
		int status = template.update(updateQuery, salary, id);
		if(status > 0) {
			return findById(id);
		} else {
			throw new RuntimeException("Data is not updated");
		}
	}
	
}
