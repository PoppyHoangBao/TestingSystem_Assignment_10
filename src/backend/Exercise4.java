package backend;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Exercise4 {
	private Connection conn;
	public Exercise4() throws SQLException{
		Exercise1 ex1 = new Exercise1();
		conn = ex1.getConnection();
	}
	public void deleteCustomerUsingTransaction(int customerNumber) throws SQLException{
		conn.setAutoCommit(false);
		try {
			String sql = "DELETE FROM payments WHERE customerNumber = ?";
			String sql2 = "DELETE FROM customers WHERE customerNumber = ?";
			PreparedStatement preStatement = conn.prepareStatement(sql);
			PreparedStatement preStatement2 = conn.prepareStatement(sql2);
			
			preStatement.setInt(1, customerNumber);
			preStatement2.setInt(1, customerNumber);
			
			preStatement.executeUpdate();
			preStatement2.executeUpdate();
			
			conn.commit();
			System.out.println("Transaction commit!!");
		}catch (Exception e) {
			e.printStackTrace();
			conn.rollback();
			System.out.println("Transaction rollback!!");
		}
		
		conn.setAutoCommit(true);
	}
}
