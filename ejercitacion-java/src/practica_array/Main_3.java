package practica_array;
import java.util.LinkedHashSet;
import java.util.Set;

public class Main_3 {
    public static void main(String[] args) {
        Set<Integer> numbers = new LinkedHashSet<Integer>();
        for (int i = 100; i < 300; i++) {
            if (numbers.size() == 10) break;
            if (isCousin(i)) numbers.add(i);
        }
        for (Integer number : numbers) System.out.println(number);
    }

    public static boolean isCousin(int numero) {
        if (numero <= 1) return false;
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) return false;
        }
        return true;
    }
}
