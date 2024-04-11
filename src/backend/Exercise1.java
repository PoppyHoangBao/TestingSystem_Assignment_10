package backend;

import java.sql.Connection;
import java.sql.DriverManager;

public class Exercise1 {
	public void connectDB() throws Exception{
		String url = "jdbc:mysql://localhost:3306/classicmodels";
		String user = "root";
		String password = "bobbibao";
		Connection conn = DriverManager.getConnection(url, user, password);
		if(conn != null) {
			System.out.println("Connect success!");
		}
	}
}
