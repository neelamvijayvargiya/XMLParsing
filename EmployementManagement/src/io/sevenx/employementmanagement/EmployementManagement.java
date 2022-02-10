package io.sevenx.employementmanagement;
	

import java.sql.SQLException;
import java.util.List;

import io.sevenx.employementmanagement.data.*;
import io.sevenx.employementmanagement.db.DatabaseManager;
import io.sevenx.employementmanagement.ui.Display;
import io.sevenx.employementmanagement.xml.EmployeeXMLParser;

public class EmployementManagement {


	public static void main(String[] args) throws SQLException {

		String path = ("C:\\Users\\ADMIN\\eclipse-workspace\\EmployementManagement\\src\\io\\sevenx\\employementmanagement\\xml\\employees.xml"); 

		List<Employee> employementmanagement = EmployeeXMLParser.parser(path);
		DatabaseManager.putInDatabase(employementmanagement);
		List<Employee> employeeList = DatabaseManager.getFromDatabase();
		
		Display.printEmployeeInfo(employeeList);
		

	}

}


