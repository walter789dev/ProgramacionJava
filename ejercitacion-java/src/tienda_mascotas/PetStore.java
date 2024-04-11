package tienda_mascotas;
import java.util.ArrayList;

public class PetStore {
	private String name;
	private ArrayList<Animal> animals;
	
	public PetStore(String name) {
		this.name = name.toLowerCase();
		this.animals = new ArrayList<Animal>();
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void feedAnimal(String name) {
		name = name.toLowerCase();
		for (int i = 0; i < animals.size(); i++) {
			if (name.equals(animals.get(i).getName())) {
				animals.get(i).feed(name);
				break;
			}
		}
	}

	public void addAnimal(Animal animal) {
		animals.add(animal);
	}
	
	public void sellAnimal(String name) {
		if (emptyAnimals()) return;
		
		name = name.toLowerCase();
		for (int i = 0; i < animals.size(); i++) {
			if (name.equals(animals.get(i).getName())) {
				System.out.println("Se ha vendido a " + name);
				animals.remove(i);
				break;
			}
		}
		System.out.println("El animal solicitado no existe");
	}
	
	public void listAnimals() {
		if (emptyAnimals()) return;
		for (Animal animal : animals) 
			System.out.println(animal);	
	}
	
	private boolean emptyAnimals() {
		boolean state = false;
		if (animals.size() == 0) {
			System.out.println("No hay animales en venta");
			state = true;
		}
		return state;
	}
}
