package biblioteca;

public class Childish extends Book {
	private boolean inColor;

	public Childish(String title, String author, String yearPublication, boolean inColor, boolean borrowed) {
		super(title, author, yearPublication, borrowed);
		this.inColor = inColor;
	}

	public boolean isInColor() {
		return inColor;
	}
}
