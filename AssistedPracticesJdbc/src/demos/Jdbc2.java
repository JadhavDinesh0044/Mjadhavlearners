package demos;

import java.sql.*;
import java.util.Scanner;

public class Jdbc2 {

	public static void main(String[] args) throws SQLException,ClassNotFoundException{
		// TODO Auto-generated method stub
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/hcl","root","123456");
		Statement stmt=conn.createStatement();
		Scanner sc=new Scanner(System.in);
		String choice="y";

		do {
		System.out.println("enter student id:");
		int n=sc.nextInt();
		System.out.println("enter student name:");
		String name=sc.next();
		System.out.println("enter student city:");
		String city=sc.next();
		stmt.execute("insert into student values("+n+",'"+name+"','"+city+"')");
		System.out.println("do you want to continue:");
		choice =sc.next();
		}while(choice.equals("y"));
		
		stmt.close();
		conn.close();

	}

}
