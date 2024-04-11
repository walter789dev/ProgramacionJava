package biblioteca;

public class Academic extends Book {
	private String type;

	public Academic(String title, String author, String yearPublication, String type, boolean borrowed) {
		super(title, author, yearPublication, borrowed);
		this.type = type;
	}

	public String getType() {
		return type;
	}
}
