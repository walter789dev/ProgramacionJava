package ejercitacion_10;

public class Novel extends Book {
	private TypeNovel type;

	public Novel(String title, String author, double price, TypeNovel type) {
		super(title, author, price);
		this.type = type;
	}

	public TypeNovel getType() {
		return type;
	}

	public void setType(TypeNovel type) {
		this.type = type;
	}
	
	@Override
	public String toString() {
		return super.toString() + ", Género: Novela " + type;
	}
	
}
