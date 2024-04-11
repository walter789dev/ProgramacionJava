package proyect_game;

public class Warrior extends BaseCharacter{
	private boolean armor = false;
	private int life_armor = 200;

	public Warrior(String name, int level, String faction) {
		super(name, 1000, level, 250, faction);
	}
	
	public boolean hasArmor() {
		return armor;
	}
	
	// Si no tiene armadura se crea. Si se destruye la que posee, no puede añadir otra. 
	public void addArmor() {
		if (life_armor == 0 && armor) System.out.println("Su armadura ya ha sido destruida");
		else if (armor == false) armor = true;
		else System.out.println("Ya tiene armadura");
	}

	@Override
	public int attack(Character character) {
		int damage = character.defend(getForce());
		return damage;
	}

	@Override
	public int defend(int damage) {
		int damageFinal = damage;
		if (getLifePoints() <= 0) return -1; // Si ha sido derrotado.
		
		if (armor) {
			if(damage >= life_armor) { 
				if (life_armor != 0) {
					life_armor = 0; // Evita que se destruya nuevamente su armadura. 
					System.out.println("Armadura destruida");
				}
				damageFinal = damage - life_armor; 
			}
			else {
				life_armor -= damage; // Se reduce la duracion/vida de la armadura.
				System.out.println("Daño absorbido por armadura");
				damageFinal = 0;
			}
		}
		else setLifePoints(getLifePoints() - damage);
		return damageFinal;
	}

	@Override
	public String getType() {
		return "Guerrero";
	}

}
