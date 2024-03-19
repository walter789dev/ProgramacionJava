package activity14_3_parte_1;

public class Motorcycle extends Bicycle {
	private double speed;
	private int displacement;
	
	public Motorcycle(String color, int wheels, String type, double speed, int displacement) {
		super(color, wheels, type);
		this.speed = speed;
		this.displacement = displacement;
	}

	@Override
	public String toString() {
		return "Motocicleta [speed=" + speed + ", displacement=" + displacement + ", type=" + getType()
				+ ", color=" + getColor() + ", wheels=" + getWheels() + "]";
	}

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}

	public int getDisplacement() {
		return displacement;
	}

	public void setDisplacement(int displacement) {
		this.displacement = displacement;
	}
}
