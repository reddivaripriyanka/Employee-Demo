package com.cg.app.employee.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.cg.app.employee.Employee;
import com.cg.app.employee.sqlQuery.SqlQuery;
@Repository
public  class EmployeeDaoImpl implements EmployeeDao{
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public void addNewEmployee(Employee employee) {
		
		jdbcTemplate.update(SqlQuery.getInstance().insertEmployee(),new Object[] {employee.getEmpId(),employee.getEmpName(),employee.getSalary()});
	}

}
