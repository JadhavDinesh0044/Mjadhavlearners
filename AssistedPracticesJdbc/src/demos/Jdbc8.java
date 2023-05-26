package demos;

import java.sql.*;
import java.util.*;

public class Jdbc8 {

	public static void main(String[] args) throws SQLException,ClassNotFoundException{
		// TODO Auto-generated method stub
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/hcl","root","123456");
		Scanner sc=new Scanner(System.in);
		System.out.println("enter student id:");
		int n=sc.nextInt();
	PreparedStatement pst=conn.prepareStatement("delete from student where stdid=?");
	
	pst.setInt(1, n);
	pst.execute();
	pst.close();
	conn.close();

	}

}
