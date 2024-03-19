package activity14_3_parte_1;
import java.util.ArrayList;
import java.util.List;

public class UseVehicle {

	public static void main(String[] args) {
		ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();
		
		vehicles.add(new Car("red", 4, 250, 500));
		vehicles.add(new Van("blue", 8, 200, 800, 350));
		vehicles.add(new Bicycle("black", 2, "urbana"));
		vehicles.add(new Motorcycle("dark-blue", 2, "deportiva", 310, 400));
		
		catalog(vehicles, 8);
	}
	
	public static void catalog(List<Vehicle> vehicles) {
		for (Vehicle vehicle : vehicles) {
			System.out.println(vehicle.toString());
		}
	}
	
	public static void catalog(List<Vehicle> vehicles, int wheels) {
		int count = 0;
		for (Vehicle vehicle : vehicles) {
			if (vehicle.getWheels() == wheels) {
				System.out.println(vehicle.toString());
				count++;
			}
		}
		
		System.out.println("Se han encontrado " + count + " vehiculos con " + wheels + " ruedas");
	}
}
