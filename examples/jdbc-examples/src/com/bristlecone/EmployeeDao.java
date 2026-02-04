package com.bristlecone;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class EmployeeDao {
	/* 	this must have CRUD operations
	 *	implement the methods as per the signature
	 *	client can be web, console or mobile, hence client will send the input & get the output
	 *	Don't create Scanner or System.out.println in the DAO 
	 *  public Employee findById(int id) // return Employee object based on the id
	 *  public int save(Employee emp) // accepts Employee object & stores its data in the DB & returns count
	 *  public boolean deleteById(int id) // return true if employee is deleted else false
	 */
	
	// select employee based on id
	public Employee findById(int id) {
		// accepts id & returns the Employee or null
		Employee emp = null;
		try {
			Connection con = DBUtil.getConnection(); // 2 steps are done
			String query = "select * from employee where id = ?";
			// Step 3
			PreparedStatement pstmt = con.prepareStatement(query);
			pstmt.setInt(1, id); // select * from employee where id = idInput
			// Step 4
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				emp = new Employee(
						rs.getInt("id"), 
						rs.getString("name"), 
						rs.getDouble("salary")); // new Employee(100, Raj, 40000)
			}
			// Step 5
			rs.close();
			pstmt.close();
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return emp;
	}
	
	// takes employee object and stores in the table and returns int
	public int save(Employee emp) {
		return 0; // default return statement
	}
	// takes an id and deletes the employee row based on id
	public boolean deleteById(int id) {
		return false; // default return statement
	}
	
}
