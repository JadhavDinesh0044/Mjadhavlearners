package demos;

import java.sql.*;
public class Jdbc5 {

	public static void main(String[] args) throws SQLException,ClassNotFoundException{
		// TODO Auto-generated method stub
		 Class.forName("com.mysql.jdbc.Driver");
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/hcl","root","123456");
		Statement stmt=conn.createStatement();
		ResultSet rs=stmt.executeQuery("select * from student where stdcity='hyderabad'");
		while(rs.next()) {
			System.out.println(rs.getInt(1) + "->" + rs.getString(2) + "->" +rs.getString(3));
		}
		stmt.close();
		conn.close();
	}

}
