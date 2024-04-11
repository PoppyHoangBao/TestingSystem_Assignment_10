package backend;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Exercise1 {
	private static Connection conn;
	public Exercise1() throws SQLException {
		String url = "jdbc:mysql://localhost:3306/classicmodels";
		String user = "root";
		String password = "bobbibao";
		conn = DriverManager.getConnection(url, user, password);
	}
	public void question1_connectDB() throws SQLException{
		if(conn == null)
			new Exercise1();
		System.out.println("Connect success");
	}
	public static Connection getConnection() {
		return conn;
	}
	
	public void question2_getInfo() throws SQLException {
		String sql = "select customerNumber, customerName from customers";
		Statement statement = conn.createStatement();
		ResultSet resultSet = statement.executeQuery(sql);
		while(resultSet.next()) {
			System.out.println("CustomerID: " + resultSet.getInt("customerNumber"));
			System.out.println("CustomerName: " + resultSet.getString("customerName"));
			System.out.println();
		}
	}
	
	public boolean question3_addCustomer(String customerName) throws SQLException{
		String sql = "insert into customers (customerName) value (?)";
		PreparedStatement preStatement = conn.prepareStatement(sql);
		preStatement.setString(1, customerName);
		return preStatement.executeUpdate() > 0;
	}
}
