package ejercitacion_10;

public class TextBookUniversity extends TextBook {
	private String university;

	public TextBookUniversity(String title, String author, double price, String course, String university) {
		super(title, author, price, course);
		this.university = university;
	}

	public String getUniversity() {
		return university;
	}

	public void setUniversity(String university) {
		this.university = university;
	}
	
	@Override
	public String toString() {
		return super.toString() + ", Publicado por: " + university;
	}

}
