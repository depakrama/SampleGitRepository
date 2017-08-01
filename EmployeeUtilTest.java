package test;

import java.util.ArrayList;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.model.employee.Employee;
import com.util.EmployeeUtil;

public class EmployeeUtilTest {
	
private EmployeeUtil empUtil;
	
	@BeforeClass
	public void init(){
		empUtil = new EmployeeUtil();
		
	}

  @Test
  public void testSort() {
	  List<Employee> employeeList = new ArrayList<Employee>();
		Employee emp1 = new Employee();
		emp1.setId(33);
		emp1.setName("Tina");
		emp1.setGpa(3.68f);
		
		Employee emp2 = new Employee();
		emp2.setId(85);
		emp2.setName("Louis");
		emp2.setGpa(3.85f);
		
		Employee emp3 = new Employee();
		emp3.setId(56);
		emp3.setName("Samar");
		emp3.setGpa(3.75f);
		
		Employee emp4 = new Employee();
		emp4.setId(19);
		emp4.setName("Samar");
		emp4.setGpa(3.75f);
		
		Employee emp5 = new Employee();
		emp5.setId(22);
		emp5.setName("Lorry");
		emp5.setGpa(3.76f);
		
		Employee emp6 = new Employee();
		emp6.setId(25);
		emp6.setName("Samil");
		emp6.setGpa(3.75f);
		
		employeeList.add(emp1);
		employeeList.add(emp2);
		employeeList.add(emp3);
		employeeList.add(emp4);
		employeeList.add(emp5);
		employeeList.add(emp6);
		
		long ms = System.currentTimeMillis();
		
		List<Employee> sortedList = empUtil.sortEmployee(employeeList);
		
		System.out.println("time taken-----"+(System.currentTimeMillis() - ms));
		
		Assert.assertEquals(sortedList.get(0).getName(), "Louis");
  }
}
