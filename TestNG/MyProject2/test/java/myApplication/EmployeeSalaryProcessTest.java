package main.java;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import org.junit.Test;

public class EmployeeSalaryProcessTest {

	EmployeeSalaryProcess empBusinessLogic =new EmployeeSalaryProcess();
	 Employee employee = new Employee();

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test(groups = {"functional"})
	public void testCalculateYearlySalary() {
		//fail("Not yet implemented");
		
		 employee.setName("James");
	      employee.setAge(25);
	      employee.setMonthlySalary(8000);
	      double salary= empBusinessLogic.calculateYearlySalary(employee);
	      assertEquals(96000, salary, 0.0);	     
		
	}

	@Test(groups = {"functional"})
	public void testCalculateAppraisal() {
		//fail("Not yet implemented");
		
		employee.setName("James");
	      employee.setAge(25);
	      employee.setMonthlySalary(8000);
	      double appraisal= empBusinessLogic.calculateAppraisal(employee);
	      assertEquals(1500, appraisal, 0.0);		
	}
	
	@Test(groups = {"negative"})
	public void negativetestCalculate() {
		//fail("Not yet implemented");
		
		employee.setName("");
	      employee.setAge(0);
	      employee.setMonthlySalary(0);
	      double appraisal= empBusinessLogic.calculateAppraisal(employee);
	      assertEquals(0, appraisal, 0.0);		
	}
	
	@Test(groups = {"boundery"})
	public void testCalculateMax() {
		//fail("Not yet implemented");
		
		employee.setName("James");
	      employee.setAge(999999999);
	      employee.setMonthlySalary(999999999);
	      double appraisal= empBusinessLogic.calculateAppraisal(employee);
	      assertEquals(999999999, appraisal, 0.0);		
	}
	
	@Test(groups = {"boundery"})
	public void NametestCalculate() {
		//fail("Not yet implemented");
		
		employee.setName("James23");
	      employee.setAge(25);
	      employee.setMonthlySalary(8000);
	      double appraisal= empBusinessLogic.calculateAppraisal(employee);
	      assertEquals(1500, appraisal, 0.0);		
	}
	
	@Test(groups = {"boundery"})
	public void AgetestCalculate() {
		//fail("Not yet implemented");
		
		employee.setName("James23");
	      employee.setAge(0);
	      employee.setMonthlySalary(8000);
	      double appraisal= empBusinessLogic.calculateAppraisal(employee);
	      assertEquals(1500, appraisal, 0.0);		
	}
	
	@Test(groups = {"boundery"})
	public void AgetestCalculatemax() {
		//fail("Not yet implemented");
		
		employee.setName("James23");
	      employee.setAge(999999999);
	      employee.setMonthlySalary(8000);
	      double appraisal= empBusinessLogic.calculateAppraisal(employee);
	      assertEquals(1500, appraisal, 0.0);		
	}
	@Test(groups = {"boundery"})
	public void MonthlySalarytestCalculateZero() {
		//fail("Not yet implemented");
		
		employee.setName("James23");
	      employee.setAge(28);
	      employee.setMonthlySalary(0);
	      double appraisal= empBusinessLogic.calculateAppraisal(employee);
	      assertEquals(1500, appraisal, 0.0);		
	}
	@Test(groups = {"boundery"})
	public void MonthlySalarytestCalculatemax() {
		//fail("Not yet implemented");
		
		employee.setName("James23");
	      employee.setAge(28);
	      employee.setMonthlySalary(999999999);
	      double appraisal= empBusinessLogic.calculateAppraisal(employee);
	      assertEquals(1500, appraisal, 0.0);		
	}
	@Test(groups = {"boundery"})
	public void assertEqualstestCalculateZero() {
		//fail("Not yet implemented");
		
		employee.setName("James23");
	      employee.setAge(28);
	      employee.setMonthlySalary(80000);
	      double appraisal= empBusinessLogic.calculateAppraisal(employee);
	      assertEquals(0, appraisal, 0.0);		
	}
	@Test(groups = {"boundery"})
	public void assertEqualstestCalculateMax() {
		//fail("Not yet implemented");
		
		employee.setName("James23");
	      employee.setAge(28);
	      employee.setMonthlySalary(80000);
	      double appraisal= empBusinessLogic.calculateAppraisal(employee);
	      assertEquals(999999999, appraisal, 0.0);	
	     }
}
