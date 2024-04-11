package frontend;

import java.sql.SQLException;

import backend.Exercise3;

public class Program3 {
	public static void main(String[] args) throws SQLException{
		Exercise3 ex3 = new Exercise3();
		int customerNumber = 310;
		if(ex3.deleteCustomerUsingProcedure(customerNumber) > 0)
			System.out.println("Updated using procedure success!");
		else
			System.out.println("Cannot find customerNumber: " + customerNumber);
	}
}
