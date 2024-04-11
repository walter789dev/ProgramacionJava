package agregacion;

import java.util.ArrayList;

public class Company {
	private ArrayList<Department> departments;
	
	public Company() {
		this.departments = new ArrayList<Department>();
	}
	
	public void addDepartment(Department dp) {
		departments.add(dp);
	}
}
