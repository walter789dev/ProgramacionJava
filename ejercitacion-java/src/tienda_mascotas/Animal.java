package tienda_mascotas;

public abstract class Animal {
	private String name;
	private int age;
	private String typeAnimal;
	private double price;
	
	public Animal(String name, int age, String typeAnimal, double price) {
		this.name = name.toLowerCase();
		this.age = age;
		this.typeAnimal = typeAnimal.toLowerCase();
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name.toLowerCase();
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getTypeAnimal() {
		return typeAnimal;
	}
	
	public void feed(String nameAnimal) {
		System.out.println("Se alimento al " + typeAnimal + " - " + nameAnimal);
	}
	
	@Override
	public String toString() {
		return "Animal: " + typeAnimal + ", Nombre: " + name + ", Edad: " + age + ", Precio: " + price;
	}
}
