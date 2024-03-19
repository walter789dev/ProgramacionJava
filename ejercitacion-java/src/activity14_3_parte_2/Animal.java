package activity14_3_parte_2;

public abstract class Animal {
	private String name;
	private int age;
	private char gender;
	
	public Animal() {}
	
	public Animal(String name, int age, char gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	
	public abstract void makeSound();
	
	public String getInformation() {
		return "Nombre: " + name + "\nEdad: " + age + "\nGenero: " + gender;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}
}
