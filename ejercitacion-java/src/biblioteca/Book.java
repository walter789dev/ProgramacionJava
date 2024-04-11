package biblioteca;

public abstract class Book implements Payable{
	private String title;
	private String author;
	private String yearPublication;
	private boolean borrowed;
	
	public Book(String title, String author, String yearPublication, boolean borrowed){
		this.title = title.toLowerCase();
		this.author = author.toLowerCase();
		this.yearPublication = yearPublication;
		this.borrowed = borrowed;
	}

	public boolean isBorrowed() {
		return borrowed;
	}

	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

	public String getYearPublication() {
		return yearPublication;
	}

	@Override
	public void lend() {
		if (borrowed) System.out.println("Ya ha sido prestado");
		else {
			System.out.println("Se ha prestado el libro '" + title + "'");
			this.borrowed = true;
		}
	}

	@Override
	public void goBack() {
		if (borrowed) System.out.println("Ya ha sido devuelto");
		else {
			System.out.println("Ha sido devueldo el libro '" + title + "'");
			this.borrowed = false;
		}
	}
	
	@Override
	public String toString() {
		return "Libro: " + title + ", Estado: " + (borrowed ? "Prestado" : "Disponible");
	}
}
