package activity19_3_herencia;

public class Account {
	protected float balance, annual_rate;
	protected float monthly_commission = 0;
	protected int numb_consignments = 0; // Cantidad de depositos.
	protected int numb_withdrawals = 0; // Cantidad de retiros.
	protected int numb_account;
	
	// Variable que actualiza el identificador de la cuenta.
	private static int next_numb_account = 100;
	
	public Account(float balance, float annual_rate) {
		this.balance = balance;
		this.annual_rate = annual_rate;
		// Inicializo su id y actualizo para una hipotetica nueva cuenta.
		this.numb_account = Account.next_numb_account;
		Account.next_numb_account += 1;
	}
	
	public void consign(float amount) {
		balance += amount;
        numb_consignments++;
	}
	
	public void withdraw(float amount) {
		float newBalance = balance - amount;
        if(newBalance >= 0){
            balance -= amount;
            numb_withdrawals++;
        }else
            System.out.println("Cuenta: " + numb_account + ", la cantidad a retirar excede el saldo actual.");
	}
	
	public void calculateInterest() {
		float monthlyRate = annual_rate / 12;
        float monthlyInterest = balance * monthlyRate;
        balance += monthlyInterest;
	}
	
	public void monthlyStatement() {
		balance -= monthly_commission;
        calculateInterest();
	}
	
	public void print() {
		System.out.println("Cuenta: " + numb_account + "\nSaldo: $" + balance + "\nTasa Anual: " 
				+ annual_rate + "\nComision Mensual: $" + monthly_commission + "\nCantidad de consignaciones: " 
				+ numb_consignments + "\nCantidad de retiros: " + numb_withdrawals + "\n");
	}
}
