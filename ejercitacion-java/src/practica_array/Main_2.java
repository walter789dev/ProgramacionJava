package practica_array;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main_2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<Integer> numbers = new LinkedList<Integer>();
        int elderly = 0;

        for (int i = 0; i < 3; i++) {
            System.out.print("Ingrese un número: ");
            int number = input.nextInt();
            if (isCousin(number) && number > elderly) elderly = number;
            numbers.add(number);
        }

        if (elderly == 0) System.out.println("No se ha ingresado un número primo");
        else System.out.println("La posición del mayor primo (" + elderly + ") es: " + numbers.lastIndexOf(elderly));
    }

    public static boolean isCousin(int numero) {
        if (numero <= 1) return false;
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) return false;
        }
        return true;
    }
}
