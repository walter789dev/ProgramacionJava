package agregacion;

public class Main_Company {

	public static void main(String[] args) {
		Company company = new Company();
		
		Department social = new Department("Redes Sociales");
		Department finance = new Department("Finanzas");
		
		Employee e_1 = new Employee("Ramiro", "Contador");
		Employee e_2 = new Employee("Ivana", "Marketing");
		Employee e_3 = new Employee("Ariana", "Community Manager");
		
		company.addDepartment(finance);
		company.addDepartment(social);
		
		social.addEmployee(e_2);
		social.addEmployee(e_3);
		finance.addEmployee(e_1);
		
		System.out.println(social.getEmployees());
		System.out.println(finance.getEmployees());

	}

}
