package Employee;


import java.sql.*;

public class conn {

	//Creating two interface
	public Connection con;  //setting up  mysql
	public Statement st;  // for queries of mysql
	
    public conn() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver"); // Load mysql jdbc driver
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee-management-system?useSSL=false&serverTimezone=UTC","root","");
			st = con.createStatement(); // helpful to execute query
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
}
