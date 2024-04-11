package biblioteca;

public class Main {
	
	public static void main(String[] args){
		Book [] books = {
			new Novel("Orgullo y prejuicio", "Jane Austen", "1813", "romance", false),
			new Academic("Interpretación de los sueños", "Sigmund Freud", "1900", "Psicologia", false),
			new Childish("El hilo invisible", "Miriam Tirado", "2023", false, true)
		};
		
		Library library = new Library();
		for (Book book : books) library.addBook(book);
		
		library.lendBook("Orgullo y prejuicio");
		library.lendBook("El hilo invisible");
		library.listBooks();
	}
}
