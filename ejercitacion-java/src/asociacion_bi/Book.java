package asociacion_bi;
import java.util.ArrayList;

public class Book {
	private String title;
	private ArrayList<Person> owners = new ArrayList<Person>();
	
	public Book(String title) {
		this.title = title; 
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getOwners() {
		if (owners.size() == 1) return title + ": Propietario -> " + owners.get(0).getName();
		String names = title + ": Propietarios -> ";
		for (Person person : owners) names += person.getName() + " - ";
		return names;
	}

	public void addOwner(Person owner) {
		owners.add(owner);
	} 
}


