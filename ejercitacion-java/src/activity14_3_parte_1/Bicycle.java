package activity14_3_parte_1;

public class Bicycle extends Vehicle {
	private String type;
	
	public Bicycle() {}

	public Bicycle(String color, int wheels, String type) {
		super(color, wheels);
		this.type = type;
	}

	@Override
	public String toString() {
		return "Bicicleta [type=" + type + ", color=" + getColor() + ", wheels=" + getWheels() + "]";
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
}
