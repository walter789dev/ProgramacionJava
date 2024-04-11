package tienda_mascotas;

public class Main {

	public static void main(String[] args) {
		Animal[] animals = {
			new Dog("Fido", 3, "Salchica", true, 10_000),
			new Cat("Pipo", 6, "Sphynx", false, 8_900),
			new Bird("Pepe", 1, "Canario", false, 7_000),
			new Fish("Nemo", 2, 10.57, 5_000)
		};
		
		PetStore store = new PetStore("AmiPet");
		for (Animal animal : animals) store.addAnimal(animal);
		
		store.sellAnimal("Jorge");
		store.listAnimals();
		store.feedAnimal("Pipo");
	}

}
