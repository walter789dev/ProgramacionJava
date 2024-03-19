package activity14_3_parte_2;

public class Bird extends Animal {
	private double peak_size;

	public Bird(String name, int age, char gender, double peak_size) {
		super(name, age, gender);
		this.peak_size = peak_size;
	}
	
	@Override
	public void makeSound() {
		System.out.println("El pajaro hace pio");
	}
	
	@Override
	public String getInformation() {
		return super.getInformation() + "\nTamaño pico: " + peak_size + "cm";
	}

	public double getPeakSize() {
		return peak_size;
	}

	public void setPeakSize(double peak_size) {
		this.peak_size = peak_size;
	}
}
