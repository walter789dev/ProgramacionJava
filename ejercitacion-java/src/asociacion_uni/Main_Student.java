package asociacion_uni;

public class Main_Student {
	
	public static void main(String[] args) {
		University u_1 = new University("Universidad de Mendoza");
		University u_2 = new University("Universidad de Palermo");
		
		Student st_1 = new Student("Roberto", u_1);
		Student st_2 = new Student("Edgardo", u_2);
		Student st_3 = new Student("Ignacio", u_2);
		
		st_3.setUniversity(u_1);
		
		System.out.println(st_1.getUniversity());
		System.out.println(st_2.getUniversity());
		System.out.println(st_3.getUniversity());
	}
}
