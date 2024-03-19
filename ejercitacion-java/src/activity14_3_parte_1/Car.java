package activity14_3_parte_1;

public class Car extends Vehicle{
	private double speed;
	private int displacement;
	
	public Car() {}
	
	public Car(String color, int wheels, double speed, int displacement) {
		super(color, wheels);
		this.speed = speed;
		this.displacement = displacement;
	}
	
	@Override
	public String toString() {
		return "Coche [speed=" + speed + ", displacement=" + displacement + ", color=" + getColor()
				+ ", wheels=" + getWheels() + "]";
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
