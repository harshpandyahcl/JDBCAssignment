package com.javaconnection.database;
import java.io.*;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class EmployeeMain {
	static Logger log = Logger.getLogger(Employee.class);

	public static void main(String[] args) throws Exception{
		PropertyConfigurator.configure("C:\\Users\\harsh\\newWorkspace\\JDBCConnectionExample\\main\\resources\\log4j.properties");
		log.debug("Sample debug message");
		log.info("Sample info message");
		log.warn("Sample warn message");
		log.error("Sample error message");
		log.fatal("Sample fatal message");
		System.out.println("Done");
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//System.out.println("Hello User Please Enter Your Name: \n");
		//String user = br.readLine();
		System.out.println("Welcome To Employee Management Application");
		while(true) {
			System.out.println("Select 1 for adding new employee");
			System.out.println("Select 2 for deleting an employee record");
			System.out.println("Select 3 for displaying all employee records");
			System.out.println("Select 4 for updating an employee record");
			System.out.println("Selcet 5 to exit");
			
			int c = Integer.parseInt(br.readLine());
			
			if(c == 1) {
				//Add employee
				System.out.println("Enter Employee's ID: ");
				int id = Integer.parseInt(br.readLine());
				System.out.println("Enter Employee's Name: ");
				String name = br.readLine();
				System.out.println("Enter Employee's DOB: ");
				String dob = br.readLine();
				System.out.println("Enter Employee's age: ");
				String age = br.readLine();
				System.out.println("Enter Employee's Salary: ");
				String salary = br.readLine();
				
				
				Employee emp = new Employee(id, name,dob,age,salary);
				boolean ans = EmployeeDatabaseOperations.insertEmployeeRecord(emp);
				if(ans) {
					System.out.println("Employee record inserted.");
					System.out.println("Employee Record:" + emp);
				}else {
					System.out.println("Some error occured while inserting!");
				}
				
			}
			else if(c == 2) {
				//Delete Employee
				System.out.println("Enter Employee Id to delete record: ");
				int userID = Integer.parseInt(br.readLine());
				boolean f = EmployeeDatabaseOperations.deleteEmployeeRecord(userID);
				if(f) {
					System.out.println("Employee with ID " + userID + " has been deleted... ");
				}else {
					System.out.println("Some error occured while deleting!");
				}
			}
			else if(c == 3) {
				//Display Employee
				
				System.out.println("Select 1 for displaying all employee records");
				System.out.println("Select 2 for searching new employee with reference to age");
				System.out.println("Select 3 for searching new employee with reference to salary");
				System.out.println("Select 4 for searching new employee with reference to name");
				System.out.println("Selcet 5 to exit");
				
				int userinp = Integer.parseInt(br.readLine());
				if(userinp == 1) {
					//Displaying all the records
					EmployeeDatabaseOperations.displayEmployeeRecord();
				}
				else if(userinp == 2) {
					//dislaying data with reference to age
					EmployeeDatabaseOperations.displayEmployeeRecordWithSal();
					
				}
				else if(userinp == 3) {
					//dislaying data with reference to salary
					EmployeeDatabaseOperations.displayEmployeeRecordWithAge();
					
				}
				else if(userinp == 4) {
					//dislaying data with reference to name
					EmployeeDatabaseOperations.displayEmployeeRecordWithName();
					
				}
				else if(c == 5) {
					//Exit
					
					System.out.println("Exit");
					break;
				}
				
			}
			else if(c == 4) {
				//Update empoyee record
				System.out.println("Select 1 to UPDATE Name");
				System.out.println("Select 2 to UPDATE DOB");
				System.out.println("Select 3 to UPDATE Age");
				System.out.println("Select 4 to UPDATE Salary");
				int val = Integer.parseInt(br.readLine());
				if(val == 1) {
					//Update Name
					System.out.println("Enter name to update");
					String name = br.readLine();
					System.out.println("Enter Id to identify the employee");
					int id = Integer.parseInt(br.readLine());
					Employee emp = new Employee();
					emp.setEmpName(name);
					boolean f = EmployeeDatabaseOperations.updateEmployeeRecord(val,name,id,emp);
					if(f) {
						System.out.println("Empolyee name updated Successfully...");
					}else {
						System.out.println("Some error occured while updating!");
					}
				}
				else if(val == 2) {
					//Update dob
					System.out.println("Enter dob to updte");
					String dob = br.readLine();
					System.out.println("Enter ID to identify update!");
					int id = Integer.parseInt(br.readLine());
					Employee st = new Employee();
					st.setEmpDob(dob);
					boolean f = EmployeeDatabaseOperations.updateEmployeeRecord(val,dob,id,st);
					if(f) {
						System.out.println("employee dob updated Successfully...");
					}else {
						System.out.println("Something Went Wrong Please try Again!");
					}
				}
				else if(val == 3) {
					//Update age
					System.out.println("Enter age to update");
					String age = br.readLine();
					System.out.println("Enter ID to identify employee!");
					int id = Integer.parseInt(br.readLine());
					Employee st = new Employee();
					st.setEmpAge(age);
					boolean f = EmployeeDatabaseOperations.updateEmployeeRecord(val,age,id,st);
					if(f) {
						System.out.println("Employee age updated successfully...");
					}else {
						System.out.println("Something Went Wrong please try again!");
					}
				}
				else if(val == 4) {
					//Update salary
					System.out.println("Enter salary to UPDATE...");
					String salary = br.readLine();
					System.out.println("Enter ID to identify employee!");
					int id = Integer.parseInt(br.readLine());
					Employee st = new Employee();
					st.setEmpAge(salary);
					boolean f = EmployeeDatabaseOperations.updateEmployeeRecord(val,salary,id,st);
					if(f) {
						System.out.println("employee salary updated Successfully...");
					}else {
						System.out.println("Something Went Wrong Please try Again!");
					}
				}
				else {
					System.out.println("Nothing has updated yet. Please select an option!");
				}
				
			}
			else if(c == 5) {
				//Exit
				
				System.out.println("Exit");
				break;
			}
			else {
				
			}
			
		}
	}
	


}
