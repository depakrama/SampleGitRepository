package com.util;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.apache.commons.lang3.builder.CompareToBuilder;

import com.model.employee.Employee;

public class EmployeeUtil {
	
	public List<Employee> sortEmployee(List<Employee> employeeList) {
		for (Employee employee : employeeList) {
			System.out.println("empy-before-"+employee);
		}
		
		Comparator<Employee> employeeComparator = new Comparator<Employee>(){
			 @Override
			    public int compare(Employee o1, Employee o2) {
			        return new CompareToBuilder()
			        		.append(o2.getGpa(), o1.getGpa())
			        		 .append(o1.getId(), o2.getId())
			        		 .append(o1.getName(), o2.getName())
			        		 .append(o2.getGpa(), o1.getGpa()).toComparison();
			    }
		};
		
		Collections.sort(employeeList, employeeComparator);
		
		System.out.println("--------------");

		for (Employee employee : employeeList) {
			System.out.println("empy-after-"+employee);
		}
		
		return employeeList;
	}

}
