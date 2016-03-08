package main.java;

public class EmployeeSalaryProcess {

	   public double calculateYearlySalary(Employee employeeDetails){
	      double yearlySalary=0;
	      yearlySalary = employeeDetails.getMonthlySalary() * 12;
	      return yearlySalary;
	   }
		
	   public double calculateAppraisal(Employee employeeDetails){
	      double appraisal=0;
	      if(employeeDetails.getMonthlySalary() < 10000){
	         appraisal = 1500;
	      }else{
	         appraisal = 2000;
	      }
	      return appraisal;
	   }
}
