package tienda_mascotas;

public class Dog extends Animal {
	private String race;
	private boolean vaccinated;

	public Dog(String name, int age, String race, boolean vaccinated, double price) {
		super(name, age, "Perro", price);
		this.race = race;
		this.vaccinated = vaccinated;
	}

	public boolean isVaccinated() {
		return vaccinated;
	}

	public void vaccinate() {
		if (vaccinated) System.out.println("Ya esta vacunado");
		else this.vaccinated = true;
	}

	public String getRace() {
		return race;
	}
	
}
