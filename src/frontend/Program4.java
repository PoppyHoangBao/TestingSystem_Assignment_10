package frontend;

import java.sql.SQLException;

import backend.Exercise4;

public class Program4 {
	public static void main(String[] args) throws SQLException{
		Exercise4 ex4 = new Exercise4();
		ex4.deleteCustomerUsingTransaction(310);
	}
}
