package demos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Jdbc6 {

	public static void main(String[] args) throws SQLException,ClassNotFoundException{
		// TODO Auto-generated method stub
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/hcl","root","123456");
		Statement stmt=conn.createStatement();
		ResultSet rs=stmt.executeQuery("select count(*)from student");
		while(rs.next()) {
			System.out.println(rs.getInt(1));
		}
		stmt.close();
		conn.close();
		// TODO Auto-generated method stub

	}

}
