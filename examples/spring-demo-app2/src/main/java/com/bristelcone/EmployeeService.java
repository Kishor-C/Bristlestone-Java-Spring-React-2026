package com.bristelcone;

public class EmployeeService {

	private EmployeeDao employeeDao;

	public EmployeeDao getEmployeeDao() {
		return employeeDao;
	}

	public void setEmployeeDao(EmployeeDao employeeDao) {
		this.employeeDao = employeeDao;
	}
	
	public void testService() {
		employeeDao.testDB();
	}
}
