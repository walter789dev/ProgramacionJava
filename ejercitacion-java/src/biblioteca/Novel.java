package biblioteca;

public class Novel extends Book {
	private String gender;

	public Novel(String title, String author, String yearPublication, String gender, boolean borrowed) {
		super(title, author, yearPublication, borrowed);
		this.gender = gender;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
}
