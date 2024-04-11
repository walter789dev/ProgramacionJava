package proyect_game;

public class Wizard extends BaseCharacter{
	private boolean shield = false;

	public Wizard(String name, int level, String faction) {
		super(name, 700, level, 180, faction);
	}
	
	public boolean hasShield() {
		return shield;
	}
	
	public void addShield() {
		if (shield) System.out.println("Ya posee un escudo");
		else shield = true;
	}

	@Override
	public int attack(Character character) {
		setLifePoints(getLifePoints() + 5); // Al atacar se cura con 5 puntos de vida.
		System.out.println("Brujo Se cura 5 puntos de salud");
		int damage = character.defend(getForce());
		return damage;
	}

	@Override
	public int defend(int damage) {
		int damageFinal = damage;
		if (getLifePoints() <= 0) return -1; // Si ya ha sido derrotado. 
		
		if (shield) { // Si posee un escudo bloquea todo el daño recibido. 
			System.out.println("Daño total bloqueado por escudo");
			shield = false; // Destruyo el escudo.
			damageFinal = 0;
		}
		else setLifePoints(getLifePoints() - damage);
		return damageFinal;
	}

	@Override
	public String getType() {
		return "Brujo";
	}

}
