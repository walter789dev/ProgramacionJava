package activity14_3_parte_1;

public class Van extends Car{
	private double burden;

	public Van(String color, int wheels, double speed, int displacement, double burden) {
		super(color, wheels, speed, displacement);
		this.burden = burden;
	}

	@Override
	public String toString() {
		return "Camioneta [burden=" + burden + ", speed=" + getSpeed() + ", displacement=" + getDisplacement()
				+ ", color=" + getColor() + ", wheels=" + getWheels() + "]";
	}

	public double getBurden() {
		return burden;
	}

	public void setBurden(double burden) {
		this.burden = burden;
	}
}
