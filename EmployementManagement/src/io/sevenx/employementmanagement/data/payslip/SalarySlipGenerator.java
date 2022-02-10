package io.sevenx.employementmanagement.data.payslip;

	import io.sevenx.employementmanagement.data.*;
	
	public class SalarySlipGenerator {
		
		public static void printSalary(Employee employee) {
			System.out.println("Name "+employee.getFirstName()+" "+employee.getLastName());
			System.out.println("Salary "+employee.getBaseSalary());
			
		}
	}

	


