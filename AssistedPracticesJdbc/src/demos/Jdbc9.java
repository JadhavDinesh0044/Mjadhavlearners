package demos;

import java.sql.*;
import java.util.*;

public class Jdbc9 {

	public static void main(String[] args) throws SQLException,ClassNotFoundException{
		// TODO Auto-generated method stub
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/hcl","root","123456");
		Scanner sc=new Scanner(System.in);
		PreparedStatement pst=conn.prepareStatement("select * from student");
		ResultSet rs=pst.executeQuery();
		while(rs.next()) {
			System.out.println(rs.getInt(1) + "->" + rs.getString(2) + "->" +rs.getString(3));
		}
	}

}
