package composicion;
import java.util.ArrayList;

public class Home {
	private ArrayList<Door> doors;

	public Home() {
		this.doors = new ArrayList<Door>();
	}
	
	public void addDoor(String material) {
		Door door = new Door(material);
		doors.add(door);
	}
	
	public String getDoors() {
		String material = "Material Puertas: ";
		for (Door door : doors) material += door.getMaterial() + " ";
		return material;
	}
}
