package practica_array;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main_1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<Integer> numbers = new LinkedList<Integer>();
        int elderly = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Ingrese un número: ");
            int number = input.nextInt();
            if (number > elderly) elderly = number;
            numbers.add(number);
        }

        System.out.println("La posición del mayor número (" + elderly + ") es: " + numbers.lastIndexOf(elderly));
    }
}

