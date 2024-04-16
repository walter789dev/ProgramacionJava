package practica_array;
import java.util.ArrayList;
import java.util.Scanner;

public class Main_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        int elderly = 0, count = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Ingrese un número: ");
            int number = input.nextInt();
            if (number > elderly) elderly = number;
            numbers.add(number);
        }

        for (Integer number : numbers) if (number == elderly) count++;
        System.out.println("El número " + elderly + " se encuentra: " + count);
    }
}
