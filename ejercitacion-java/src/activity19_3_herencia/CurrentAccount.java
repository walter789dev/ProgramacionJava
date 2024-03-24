package activity19_3_herencia;

public class CurrentAccount extends Account{
	protected float overdraft;

	public CurrentAccount(float balance, float annual_rate) {
		super(balance, annual_rate);
		this.overdraft = 0;
	}
	
	@Override
	public void consign(float amount) {
		if (balance < 0) {
			float newBalance = balance + amount;
			if (newBalance > 0 && overdraft > 0) 
				overdraft -= newBalance;
			else 
				overdraft -= amount;
		}
		super.consign(amount);
	}
	
	@Override
	public void withdraw(float amount) {
		float newBalance;
		// En caso de que haya un monto en el sobregiro (en contra).
		if (overdraft > 0) {
			newBalance = overdraft - amount;
			if (newBalance <= 0) {
	        	overdraft = 0; 
	        	balance = Math.abs(newBalance);
	        }
			else overdraft -= amount;
		}
		// En caso de que tenga saldo a favor. 
		else {
			newBalance = balance - amount;
	        if (newBalance <= 0) {
	        	overdraft += Math.abs(newBalance);
	        	balance = 0;
	        }
	        else balance -= amount;
		}
        numb_withdrawals++;
	}
	
	@Override
	public void print() {
		int number_transactions = numb_consignments + numb_withdrawals;
		System.out.println("Cuenta: " + numb_account + "\nSaldo: $" + balance + "\nComisión Mensual: $" + monthly_commission
				+ "\nNúmero de transacciones realizadas: " + number_transactions 
				+ "\nSobregiro: $" + overdraft + "\n");
	}
}
