package proyect_game;
import java.util.Random;

public class Rogue extends BaseCharacter{
	private int total_avoid = 0;

	public Rogue(String name, int level, String faction) {
		super(name, 600, level, 170, faction);
	}
	
	public int getTotalAvoid() {
		return total_avoid;
	}

	@Override
	public int attack(Character character) {
		Random random = new Random(); // Tiene la probabilidad del 50% de atacar 2 veces.
		int damage = 0;
		
		if (random.nextInt(2) == 1) { // Ataca dos veces
			System.out.println("Picaro ataca 2 veces");
			for (int i = 0; i < 2; i++) {
				damage += character.defend(getForce());
			}
		}
		else damage = character.defend(getForce());
		return damage;
	}

	@Override
	public int defend(int damage) {
		Random random = new Random(); // Tiene la probabilidad del 50% de esquivar el ataque.
		int damageFinal = damage;
		if (getLifePoints() <= 0) return -1; // Si ha sido derrotado.
		
		if (random.nextInt(2) == 1) {
			System.out.println("Ha esquivado el ataque");
			total_avoid++; // Almaceno la cantidad de esquives realizados. 
			damageFinal = 0;
		}
		else setLifePoints(getLifePoints() - damage);
		return damageFinal;
	}

	@Override
	public String getType() {
		return "Picaro";
	}

}
