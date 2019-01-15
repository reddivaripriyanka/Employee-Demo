package com.cg.app.employee.validation;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.cg.app.employee.Employee;

@Component
public class EmployeeValidation implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void validate(Object target, Errors errors) {
		Employee employee=(Employee)target;
		if(employee.getEmpName().length()<2) {
			errors.rejectValue("empName","empName.length","Employee name Must have two characters");
			}
		if(employee.getSalary()<100000) {
			errors.rejectValue("salary", "salary.minumun","Salary must be greter than 1 laksh");
		}
	}

}
