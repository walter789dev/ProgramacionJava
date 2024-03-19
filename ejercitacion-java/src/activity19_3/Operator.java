package activity19_3;

public class Operator extends Employee {
	private String dni;
	
	public Operator() {}
	public Operator(String id, String name, double salario, String dni) {
		super(id, name, salario);
		this.dni = dni;
	}
	
	public String getDni() {
		return dni;
	}
	
	public void operateMachinery(String machine) {
		System.out.println("El operario va a trabajar con: " + machine);
	}
	
	@Override
	public String toString() {
		return super.toString() + ", Dni: " + dni;
	}
	
}
