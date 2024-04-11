package tienda_mascotas;

public class Cat extends Animal {
	private String race;
	private boolean sterilized;

	public Cat(String name, int age, String race, boolean sterilized, double price) {
		super(name, age, "Gato", price);
		this.race = race;
		this.sterilized = sterilized;
	}

	public boolean isSterilized() {
		return sterilized;
	}

	public void sterilize() {
		if (sterilized) System.out.println("Ya esta vacunado");
		else this.sterilized = true;
	}

	public String getRace() {
		return race;
	}

}
