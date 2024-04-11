package ejercitacion_8;

public class EmployeeManagement {

	public static void main(String[] args) {
		Worker w_1 = new Worker("Robert", 30, 30_000, "Reparación");
		Manager m_1 = new Manager("Esteban", 28, 50_000, "Contabilidad");
		
		System.out.println(w_1);
		w_1.workArea();
		
		System.out.println(m_1);
		m_1.organizeActivities();
	}

}
