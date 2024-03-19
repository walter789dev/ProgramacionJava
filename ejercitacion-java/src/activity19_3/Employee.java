package activity19_3;

public abstract class Employee {
	private String name;
	private double salary;
	private String id;
	
	public Employee() {}
	public Employee(String id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	public String getId() {
		return id;
	}

	public double getSalary() {
		return salary;
	}
	
	public void setSalary(double salary ) {
		this.salary = salary;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "ID: " + id + ", Name: " + name + ", : " + salary;
	}
}
