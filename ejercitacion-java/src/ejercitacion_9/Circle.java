package ejercitacion_9;

public class Circle extends GeometricFigure{
	private double radio;
	
	public Circle(double radio) {
		this.radio = radio;
	}
	
	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}

	@Override
	public double calculateArea() {
		return Math.round((Math.PI * Math.pow(radio, 2)) * 100.0) / 100.0;
	}

	@Override
	public double calculatePerimeter() {
		return Math.round((2 * Math.PI * radio) * 100.0) / 100.0;
	}

}
