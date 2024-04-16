package practica_array;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<Integer> numbers = new LinkedList<Integer>();

        for (int i = 0; i < 10; i++) {
            System.out.print("Ingrese un número: ");
            int number = input.nextInt();
            numbers.add(number);
        }

        for (Integer number : numbers) {
            String[] parse = number.toString().split("");
            if (parse[parse.length - 1].equals("4")) System.out.println("Indice de " + number + ": " + numbers.indexOf(number));
        }
    }
}
