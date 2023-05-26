package demos;

import java.sql.*;
import java.util.*;
public class Jdbc4 {

	public static void main(String[] args) throws SQLException,ClassNotFoundException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/hcl","root","123456");
		Statement stmt=conn.createStatement();
		Scanner sc=new Scanner(System.in);
		//System.out.println("enter student id:");
		//int n=sc.nextInt();
		System.out.println("enter student name:");
		String name=sc.next();
		//System.out.println("enter student city:");
		//String city=sc.next();
		stmt.execute("update  student set name= '"+name+"' where id =106");
		
		stmt.close();
		conn.close();


	}

}
