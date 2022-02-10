package io.sevenx.employementmanagement.xml;

	import javax.xml.bind.JAXBContext;
	import javax.xml.bind.JAXBException;
	import javax.xml.bind.Unmarshaller;

	import java.io.File;
	import java.util.List;


	import io.sevenx.employementmanagement.data.Employee;

	public class EmployeeXMLParser {
		

		public static List<Employee> parser(String path) {
		
			File file = new File("C:\\Users\\ADMIN\\eclipse-workspace\\EmployementManagement\\src\\io\\sevenx\\employementmanagement\\employees.xml"); 

			JAXBContext jaxbContext;
			try {
				jaxbContext = JAXBContext.newInstance(Employees.class);

				Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();

				Employees employees = (Employees) jaxbUnmarshaller.unmarshal(file);
				List<Employee> employeeList = employees.getEmployee();

				return employeeList;
				
			} 
			
			catch (JAXBException e) {
			e.printStackTrace();
			}
			return null;

		}

	}


