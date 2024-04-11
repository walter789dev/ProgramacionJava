package proyect_game;

public interface Character {
	// Al atacar invoca el metodo defend del personaje atacado.
	public abstract int attack(Character character);
	// Es utilizada por el personaje que recibe el ataque.
	public abstract int defend(int damage);
	// Util para obtener el tipo de personaje. 
	public abstract String getType();
	
}
