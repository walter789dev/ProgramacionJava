package activity19_3_herencia;

public class UseAccounts {

	public static void main(String[] args) {
		Account act1 = new SavingsAcount(30000, 2);
		Account act2 = new CurrentAccount(55000, 10);
		Account act3 = new SavingsAcount(5000, 15);
		Account act4 = new CurrentAccount(-700, 20);
		
		act1.consign(4000);
		act1.withdraw(35000);
		act2.withdraw(58000);
		act3.consign(15008);
		act4.withdraw(1500);
		
		// Realizo 5 extracciones para aumentar la comision mensual. 
		for (int i = 0; i < 5; i++) act1.withdraw(100);
		
		act1.monthlyStatement();
		act1.print();
		act2.print();
		act4.print();
	}
}
