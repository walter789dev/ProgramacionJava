package ejercitacion_10;

public class TextBook extends Book {
	private String course;

	public TextBook(String title, String author, double price, String course) {
		super(title, author, price);
		this.course = course;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}
	
	@Override
	public String toString() {
		return super.toString() + ", Curso: " + course;
	}
}
