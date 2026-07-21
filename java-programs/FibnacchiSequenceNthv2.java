
import java.util.Scanner;

public class FibnacchiSequenceNthv2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inputDigit = sc.nextInt();
        int result = fibInteger(inputDigit);
        System.out.println(result);
        sc.close();
    }

    public static Integer fibInteger(Integer n) {
        if (n == 0 || n == 1) {
            return n;
        } else {
            return fibInteger(n - 1) + fibInteger(n - 2);
        }
    }
}
