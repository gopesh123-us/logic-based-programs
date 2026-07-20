
import java.util.Scanner;

public class SumOddDigits {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int digits = scanner.nextInt();
            int total = 0;
            while (digits != 0) {
                if (digits % 10 % 2 != 0) {
                    total = total + digits % 10;
                }
                digits = digits / 10;
            }
            System.out.println(total);
        }
    }
}
