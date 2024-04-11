package asociacion_bi;
import java.util.ArrayList;

public class Person {
	private String name;
	private ArrayList<Book> books = new ArrayList<Book>();
	
	public Person(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBooks() {
		if (books.size() == 1) return name +  ": Libro -> " + books.get(0).getTitle();
		String titles = name + ": Libros -> ";
		for (Book book : books) titles += book.getTitle() + " - ";
		return titles;
	}

	public void addBook(Book book) {
		books.add(book);
		book.addOwner(this);
	} 
}
