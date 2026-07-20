
import java.util.Scanner;

public class SumEvenDigits {

    public static void main(String[] args) {
        int total = 0;
        try (Scanner sc = new Scanner(System.in)) {
            int num = sc.nextInt();
            while (num != 0) {
                if (num % 10 % 2 == 0) {
                    total = total + num % 10;
                }
                num = num / 10;
            }
        }
        System.out.println(total);

    }
}
