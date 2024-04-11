package ejercitacion_9;

public class Rectangle extends GeometricFigure{
	private double base, height;
	
	public Rectangle(double base, double height) {
		this.base = base;
		this.height = height;
	}
	
	public double getBase() {
		return base;
	}
	
	public void setBase(double base) {
		this.base = base;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	@Override
	public double calculateArea() {
		return base * height;
	}

	@Override
	public double calculatePerimeter() {
		return base * 2 + height * 2;
	}
}
