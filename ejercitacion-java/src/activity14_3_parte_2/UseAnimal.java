package activity14_3_parte_2;
import java.util.ArrayList;

public class UseAnimal {

	public static void main(String[] args) {
		ArrayList<Animal> animals = new ArrayList<Animal>();
		
		animals.add(new Dog("Rodolfo", 10, 'M', 30.70));
		animals.add(new Cat("Bigotes", 5, 'F', 10.50));
		animals.add(new Bird("Piolin", 2, 'M', 1.5));
		
		for (Animal animal : animals) {
			System.out.println(animal.getInformation());
			animal.makeSound();
			System.out.println();
		}
	}

}
