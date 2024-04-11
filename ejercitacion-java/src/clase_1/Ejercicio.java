package clase_1;

public class Ejercicio {

	public static void main(String[] args) {
		Square square = new Square(10);
		Circle circle = new Circle(3.5);
		
		System.out.println("Area del Cuadrado: " + square.getArea());
		System.out.println("Area del Circulo: " + circle.getArea());
	}

}
