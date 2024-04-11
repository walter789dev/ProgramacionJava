package ejercitacion_8;

public class Manager extends Employee{
	private String department;

	public Manager(String name, int age, double salary, String department) {
		super(name, age, salary);
		this.department = department.toLowerCase();
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}
	
	public void organizeActivities() {
		System.out.println("Dirigiendo en el departamento de '" + department + "'\n");
	} 
	
	@Override
	public String toString() {
		return super.toString() + "Departamento: " + department + "\n";
	}
}
