package frontend;

import backend.Exercise1;

public class Program1 {
	public static void main(String[] args) throws Exception {
		Exercise1 ex1 = new Exercise1();
		ex1.question1_connectDB();
		ex1.question2_getInfo();
		if(ex1.question3_addCustomer("bobbi bao")) {
			System.out.println("Added success");
		};
		if(ex1.question4_updateCustomer(310)) {
			System.out.println("Updated success!");
		};
		if(ex1.question5_deleteCustomer(310)) {
			System.out.println("Deleted success!");
		};
		ex1.getConnection().close();
	}
}
