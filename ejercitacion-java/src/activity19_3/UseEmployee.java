package activity19_3;

public class UseEmployee {

	public static void main(String[] args) {
		Operator op1 = new Operator("3456", "Manuel", 300000, "3456789");
		Executive dir1 = new Executive("2456","Jose", 500000, "Contabilidad");
		Official of1 = new Official("1267", "Esteban", 400000, "4579023");
		Technical tec1 = new Technical("1289", "Osvaldo", 350000, "4567674", "Mecanica");
		
		op1.operateMachinery("Soldadora");
		dir1.takeDecision("Pagar horas extras");
		of1.superviseOperators();
		tec1.repairMachine("Transportadora");
		System.out.println(tec1.toString());
	}
}
