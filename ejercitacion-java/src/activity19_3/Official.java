package activity19_3;

public class Official extends Operator {

	public Official() {}
	public Official(String id, String name, double salary, String dni) {
		super(id, name, salary, dni);
	}
	
	public void superviseOperators() {
		System.out.println("El oficial va a supervisar a los operarios");
	}
	
	@Override
	public void operateMachinery(String machine) {
		System.out.println("El oficial va a utilizar: " + machine);
	}
}
