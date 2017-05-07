package test.rahul;

import java.sql.*;

public class DBConnection {
	public static void main(String args[]){
		try {
			//Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/rahuldb","rahul","rahul");
			Statement stmt = con.createStatement();
			//stmt.executeUpdate("insert into personalinfo values ('2','Sumit')");
			ResultSet rs = stmt.executeQuery("Select * from personalinfo");
			while(rs.next()){
				System.out.println(rs.getInt(1)+" "+rs.getString(2));
				continue;
			}
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
