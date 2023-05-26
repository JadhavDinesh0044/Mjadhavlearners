package demos;

import java.sql.*;

public class Jdbc7 {

	public static void main(String[] args)throws SQLException,ClassNotFoundException{
		// TODO Auto-generated method stub
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/hcl","root","123456");
		Statement stmt=conn.createStatement(); 
		stmt.addBatch("insert into student values(111,'kohli','assam')");
		stmt.addBatch("update student set stdcity='vizag' where stdid=108");
		stmt.addBatch("delete from student where stdid=106");
		stmt.executeBatch();
		System.out.println("success");
		stmt.close();
		conn.close();
	}

}
