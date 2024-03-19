package activity14_3_parte_2;

public class Dog extends Animal {
	private double snout_size;
	
	public Dog() {}

	public Dog(String name, int age, char gender, double snout_size) {
		super(name, age, gender);
		this.snout_size = snout_size;
	}
	
	@Override
	public void makeSound() {
		System.out.println("El perro ladra");
	}
	
	@Override
	public String getInformation() {
		return super.getInformation() + "\nTamaño hocico: " + snout_size + "cm";
	}

	public double getSnoutSize() {
		return snout_size;
	}

	public void setSnoutSize(double snout_size) {
		this.snout_size = snout_size;
	}
}
