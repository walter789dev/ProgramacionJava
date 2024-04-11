package proyect_game;

public abstract class BaseCharacter implements Character{
	private String name, faction;
	private int lifePoints, level, force;
	
	public BaseCharacter(String name, int lifePoints, int level, int force, String faction) {
		this.name = name;
		this.level = level;
		this.lifePoints = upgradeStatistic(lifePoints, level);
		this.force = upgradeStatistic(force, level);
		this.faction = faction;
	}
	
	// Se definen sus estadisticas dependiendo el nivel que tenga.
	private int upgradeStatistic(int stadistic, int level) {
		return stadistic + stadistic * (level / 100);
	}
	
	// Mejoran sus estadisticas al subir de nivel.
	private void upgradeStatistic(int level) {
		lifePoints += lifePoints * (level / 100);
		force += force * (level / 100);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getLifePoints() {
		return lifePoints;
	}
	
	public void setLifePoints(int lifePoints) {
		this.lifePoints = lifePoints;
	}

	public int getLevel() {
		return level;
	}
	
	// Al actualizar su nivel aumentan sus estadisticas.
	public void setLevel(int level) {
		if (level < getLevel()) System.out.println("El nivel solamente puede ser mayor al actual: " + getLevel());
		else upgradeStatistic(level);
	}

	public int getForce() {
		return force;
	}

	public String getFaction() {
		return faction;
	}

	public void setFaction(String faction) {
		this.faction = faction;
	}
}
