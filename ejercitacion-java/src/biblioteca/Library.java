package biblioteca;
import java.util.ArrayList;

public class Library {
	private ArrayList<Book> books;
	
	public void addBook(Book book) {
		books.add(book);
	}
	
	public void lendBook(String title) {
		title = title.toLowerCase();
		if (emptyBooks()) return;
		for (int i = 0; i < books.size(); i++) {
			if (title.equals(books.get(i).getTitle()))
				books.get(i).lend();
		}
	}
	
	public void goBackBook(String title) {
		title = title.toLowerCase();
		for (int i = 0; i < books.size(); i++) {
			if (title.equals(books.get(i).getTitle()))
				books.get(i).goBack();
		}
	}
	
	public void listBooks() {
		if (emptyBooks()) return;
		for (Book book : books) {
			System.out.println(book);
		}
	}
	
	private boolean emptyBooks() {
		boolean state = false;
		if (books.size() == 0) {
			System.out.println("No hay libros disponibles");
			state = true;
		}
		return state;
	}
}
