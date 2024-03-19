package activity19_3;

public class Technical extends Operator {
	private String specialty;

	public Technical() {}
	public Technical(String id, String name, double salary, String dni , String specialty) {
		super(id, name, salary, dni);
		this.specialty = specialty;
	}
	
	public String getSpecialty() {
		return specialty;
	}
	
	public void setSpecialty(String specialty) {
		this.specialty = specialty;
	}
	
	public void repairMachine(String machine) {
		System.out.println("El tecnico debe arreglar: " + machine);
	}
	
	@Override
	public void operateMachinery(String machine) {
		System.out.println("El tecnico va a utilizar: " + machine);
	}
	
	@Override
	public String toString() {
		return super.toString() + ", specialty: " + specialty;
	}
}
