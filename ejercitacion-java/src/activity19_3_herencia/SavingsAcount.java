package activity19_3_herencia;

public class SavingsAcount extends Account{
	private static final float MIN_AMOUNT = 10000;
	private static final int COMMISION = 1000;
	// Defino el monto minimo y la comision mensual. 
	
	protected boolean active;

	public SavingsAcount(float balance, float annual_rate) {
		super(balance, annual_rate);
		this.active = balance > SavingsAcount.MIN_AMOUNT;
	}
	
	@Override
	public void consign(float amount) {
		if (active) super.consign(amount);
		else System.out.println("Cuenta: " + numb_account + ", su cuenta no esta activa.");
	}
	
	@Override
	public void withdraw(float amount) {
		if (active) super.withdraw(amount);
		else System.out.println("Cuenta: " + numb_account + ", su cuenta no esta activa.");
	}
	
	@Override
	public void monthlyStatement() {
		if(numb_withdrawals > 4) {
			// En caso de que supere el número valido de retiros,
			// obtengo la diferencia y multiplico por la comision mensual. 
			int difference = numb_withdrawals - 4;
			monthly_commission += SavingsAcount.COMMISION * difference;
		}
		balance -= monthly_commission;
        calculateInterest();
		active = balance > SavingsAcount.MIN_AMOUNT;
	}
	
	@Override
	public void print() {
		int number_transactions = numb_consignments + numb_withdrawals;
		System.out.println("Cuenta: " + numb_account + "\nSaldo: $" + balance + "\nComisión Mensual: $" + monthly_commission
				+ "\nNúmero de transacciones realizadas: " + number_transactions + "\n");
	}
	
}
