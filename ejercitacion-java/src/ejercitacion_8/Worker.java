package ejercitacion_8;

public class Worker extends Employee{
	private String area;

	public Worker(String name, int age, double salary, String area) {
		super(name, age, salary);
		this.area = area.toLowerCase();
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}
	
	public void workArea() {
		System.out.println("Trabajando en el area de '" + area + "'\n");
	}
	
	@Override
	public String toString() {
		return super.toString() + "Area: " + area + "\n";
	}
}
