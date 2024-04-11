package ejercitacion_9;

public class CreateFigures {

	public static void main(String[] args) {
		Rectangle r_1 = new Rectangle(14.6, 20.3);
		Circle c_1 = new Circle(13.2);
		
		System.out.println("Area Rectangulo: " + r_1.calculateArea());
		System.out.println("Perimetro Rectangulo: " + r_1.calculatePerimeter());
		System.out.println("Area Circulo: " + c_1.calculateArea());
		System.out.println("Perimetro Circulo: " + c_1.calculatePerimeter());
	}

}
