package backend;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;

public class Exercise3 {
	public Exercise3() {
		// TODO Auto-generated constructor stub
	}
	public int deleteCustomerUsingProcedure(int customerNumber) throws SQLException {
		Exercise1 ex1 = new Exercise1();
		Connection conn = ex1.getConnection();
		String sql = "CALL sp_delete_customer(?)";
		CallableStatement callableStatement = conn.prepareCall(sql);
		callableStatement.setInt(1, customerNumber);
		return callableStatement.executeUpdate();
	}
}
