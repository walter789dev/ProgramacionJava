package activity14_3_parte_2;

public class Cat extends Animal {
	private double claw_size;
	
	public Cat() {}

	public Cat(String name, int age, char gender, double claw_size) {
		super(name, age, gender);
		this.claw_size = claw_size;
	}
	
	@Override
	public void makeSound() {
		System.out.println("El gato hace miau");
	}
	
	@Override
	public String getInformation() {
		return super.getInformation() + "\nTamaño garras: " + claw_size + "cm";
	}

	public double getClawSize() {
		return claw_size;
	}

	public void setClawSize(double claw_size) {
		this.claw_size = claw_size;
	}
}
