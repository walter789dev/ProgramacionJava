package proyect_game;
import java.util.Random;

public class Game {
	public static void main(String[] args) {
		Character [] characters = { // Creo 3 personajes
				new Warrior("Pedro", 5, "Facción 1"),
				new Wizard("Roberto", 8, "Facción 2"),
				new Rogue("Esteban", 10, "Facción 3")
		};
		
		for (int i = 0; i < 3; i++) { // Creo 2 rondas de ataques.
			for (int j = 0; j < characters.length; j++) {
				int index = 0;
				
				do { // Evito que se ataquen a si mismos.
					Random random = new Random();
					index = random.nextInt(3);
				} while (index == j);
				
				Character attacker = characters[j]; // Atacante.
				Character attacked = characters[index]; // Atacado.
				
				System.out.println(attacker.getType() + " ataca a " + attacked.getType());
				
				int damage = attacker.attack(attacked); // Obtengo el daño realizado. 
				
				if (damage == -1) System.out.println("Ha sido derrotado \n");
				else System.out.println("Daño recibido por "+ attacked.getType() + ": " + damage + "\n");
				
				}
			}
		}
}
