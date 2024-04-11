package tienda_mascotas;

public class Fish extends Animal {
	private double size;

	public Fish(String name, int age, double size, double price) {
		super(name, age, "Pez", price);
		this.size = size;
	}

	public double getSize() {
		return size;
	}
}
