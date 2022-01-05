package com.javaconnection.database;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.*;
public class EmployeeDatabaseOperations {

	public static boolean insertEmployeeRecord(Employee emp) {
		boolean f = false;
		try {
			Connection conn = DBconnect.createc();
			String query = "insert into employeeinfo(EmpID,EmpName,EmpDOB,EmpAge,EmpSalary) values(?,?,?,?,?)";
			PreparedStatement statement = conn.prepareStatement(query);
			//set the value of parameters
			statement.setInt(1, emp.getEmpID());
			statement.setString(2, emp.getEmpName());
			statement.setString(3, emp.getEmpDob());
			statement.setString(4, emp.getEmpAge());
			statement.setString(5, emp.getEmSalary());
			
			
			//execute..
			statement.executeUpdate();
			
			f = true;
		} catch (Exception e) {
			// TODO: handle exception
		}
		return f;
	}


	public static boolean deleteEmployeeRecord(int EmpID) {
		// TODO Auto-generated method stub
		boolean f = false;
		try {
			Connection conn = DBconnect.createc();
			String query = "delete from employeeinfo where EmpID=?";
			PreparedStatement statement = conn.prepareStatement(query);
			//set the value of parameters
			statement.setInt(1, EmpID);
			
			//execute..
			statement.executeUpdate();
			
			f = true;
		} catch (Exception e) {
			// TODO: handle exception
		}
		return f;
	}


	public static void displayEmployeeRecord() {
		
		
		try {
			Connection conn = DBconnect.createc();
			String query = "select * from employeeinfo";
			Statement st = conn.createStatement();
			ResultSet set = st.executeQuery(query);
			
			while(set.next()) {
				int id = set.getInt(1);
				String name = set.getString(2);
				String dob = set.getString(3);
				String age = set.getString(4);
				String salary = set.getString(5);
				
				System.out.println("EmpID: " + id + " \n EmpName: " + name + " \nEmpdob: " + dob + " \nEmpAge: " + age+ " \nEmpSalary: " + salary);
				System.out.println("----------------------------------------------");
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	public static void displayEmployeeRecordWithSal() {
		

		try {
			Connection conn = DBconnect.createc();
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String userinp = br.readLine();
			String query = "select * from employeeinfo where salary "+userinp;
			Statement st = conn.createStatement();
			ResultSet set = st.executeQuery(query);
			
			while(set.next()) {
				int id = set.getInt(1);
				String name = set.getString(2);
				String dob = set.getString(3);
				String age = set.getString(4);
				String salary = set.getString(5);
				
				System.out.println("EmpID: " + id + " \n EmpName: " + name + " \nEmpdob: " + dob + " \nEmpAge: " + age+ " \nEmpSalary: " + salary);
				System.out.println("----------------------------------------------");
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	
	public static void displayEmployeeRecordWithAge() {
		
		
		try {
			Connection conn = DBconnect.createc();
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String userinp = br.readLine();
			String query = "select * from employeeinfo where age "+userinp;
			Statement st = conn.createStatement();
			ResultSet set = st.executeQuery(query);
			
			while(set.next()) {
				int id = set.getInt(1);
				String name = set.getString(2);
				String dob = set.getString(3);
				String age = set.getString(4);
				String salary = set.getString(5);
				
				System.out.println("EmpID: " + id + " \n EmpName: " + name + " \nEmpdob: " + dob + " \nEmpAge: " + age+ " \nEmpSalary: " + salary);
				System.out.println("----------------------------------------------");
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	
	public static void displayEmployeeRecordWithName() {
		
		try {
			Connection conn = DBconnect.createc();
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String userinp = br.readLine();
			String query = "select * from employeeinfo where name "+userinp;
			Statement st = conn.createStatement();
			ResultSet set = st.executeQuery(query);
			
			while(set.next()) {
				int id = set.getInt(1);
				String name = set.getString(2);
				String dob = set.getString(3);
				String age = set.getString(4);
				String salary = set.getString(5);
				
				System.out.println("EmpID: " + id + " \n EmpName: " + name + " \nEmpdob: " + dob + " \nEmpAge: " + age+ " \nEmpSalary: " + salary);
				System.out.println("----------------------------------------------");
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}



	public static boolean updateEmployeeRecord(int val,String toUpdate,int id,Employee emp) {
		// TODO Auto-generated method stub
		boolean f = false;
		
		try {
			  Connection conn = DBconnect.createc();
			 if(val == 1) {
					//Update Name
					
						String query = "update employeeinfo set EmpName=? where EmpID=?";
						PreparedStatement statement= conn.prepareStatement(query);
						statement.setString(1, toUpdate);
						statement.setInt(2, id);
						
						//execute..
						statement.executeUpdate();
						f = true;
				}
				else if(val == 2) {
					//Update Phone
					String query = "update employeeinfo set EmpDOB=? where EmpID=?";
					PreparedStatement statement= conn.prepareStatement(query);
					statement.setString(1, toUpdate);
					statement.setInt(2, id);
					
					//execute..
					statement.executeUpdate();
					f = true;
				}
				else if(val == 3) {
					//Update City
					String query = "update employeeinfo set EmpAge=? where EmpID=?";
					PreparedStatement statement = conn.prepareStatement(query);
					statement.setString(1, toUpdate);
					statement.setInt(2, id);
					
					//execute..
					statement.executeUpdate();
					f = true;
				}
				else if(val == 4) {
					//Update City
					String query = "update employeeinfo set EmpSalary=? where EmpID=?";
					PreparedStatement statement = conn.prepareStatement(query);
					statement.setString(1, toUpdate);
					statement.setInt(2, id);
					
					//execute..
					statement.executeUpdate();
					f = true;
				}
				else {
					
				}
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		return f;
	}
}
