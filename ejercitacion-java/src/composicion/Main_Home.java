package composicion;

public class Main_Home {

	public static void main(String[] args) {
		Home h_1 = new Home();
		h_1.addDoor("Roble");
		h_1.addDoor("Abedul");
		
		System.out.println(h_1.getDoors());
	}

}
