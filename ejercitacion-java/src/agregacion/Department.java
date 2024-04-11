package agregacion;

import java.util.ArrayList;

public class Department {
	private String name;
	private ArrayList<Employee> employees;
	
	public Department(String name) {
		this.name = name;
		this.employees = new ArrayList<Employee>();
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void addEmployee(Employee emp) {
		employees.add(emp);
	}
	
	public String getEmployees() {
		String names = "Empleados " + name + ": ";
		for (Employee employee : employees) names += employee.getName() + " ";
		return names;
	}
}
