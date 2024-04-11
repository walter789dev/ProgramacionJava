package tienda_mascotas;

public class Bird extends Animal {
	private String species;
	private boolean speak;

	public Bird(String name, int age, String species, boolean speak, double price) {
		super(name, age, "Pajaro", price);
		this.species = species;
		this.speak = speak;
	}

	public String getSpecies() {
		return species;
	}

	public boolean isSpeak() {
		return speak;
	}

}
