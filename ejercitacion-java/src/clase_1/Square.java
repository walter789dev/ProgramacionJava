package clase_1;

public class Square implements Rotatable, Figure, Drawable{
	private double side;
	
	public Square(double side) {
		this.side = side;
	}

	@Override
	public void draw() {
		System.out.println("Dibujando cuadrado...");
	}

	@Override
	public double getArea() {
		return side * side;
	}

	@Override
	public void rotate() {
		System.out.println("Rotando cuadrado...");
	}
}
