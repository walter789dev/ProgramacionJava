package activity19_3;

public class Executive extends Employee {
	private String department;

	public Executive () {}
	public Executive(String id, String name, double salario, String department) {
		super(id, name, salario);
		this.department = department;
	}
	
	public String getDepartment() {
		return department;
	}
	
	public void setDepartment(String department) {
		this.department = department;
	}
	
	public void takeDecision(String decision) {
		System.out.println("El directivo tomo la decision de: " + decision);
	}
	
	@Override
	public String toString() {
		return super.toString() + ", Departamento: " + department;
	}
	
}
