package clase_1;

public class Circle implements Drawable, Figure {
	private double radio;
	
	public Circle(double radio) {
		this.radio = radio;
	}

	@Override
	public double getArea() {
		return Math.PI * Math.pow(radio, 2);
	}

	@Override
	public void draw() {
		System.out.println("Dibujando Circulo...");
	}
}
