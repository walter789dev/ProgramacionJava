package asociacion_bi;

public class Main_Book {

	public static void main(String[] args) {
		Person p_1 = new Person("Roberto");
		Person p_2 = new Person("Lucila");
		Person p_3 = new Person("Esteban");
		
		Book b_1 = new Book("La Divina Comedia");
		Book b_2 = new Book("El Lobo Estepario");
		Book b_3 = new Book("El Banquete");
		
		p_1.addBook(b_1);
		p_2.addBook(b_2);
		p_2.addBook(b_3);
		p_3.addBook(b_3);
		
		System.out.println(p_1.getBooks()); 
		System.out.println(b_1.getOwners());
		System.out.println(p_2.getBooks()); 
		System.out.println(b_2.getOwners());
		System.out.println(p_3.getBooks()); 
		System.out.println(b_3.getOwners());
	}
}
