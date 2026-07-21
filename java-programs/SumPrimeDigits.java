
import java.util.Scanner;

public class SumPrimeDigits {

    public static void main(String[] args) {
        int total = 0;
        try (Scanner sc = new Scanner(System.in)) {
            int digits = sc.nextInt();
            while (digits != 0) {
                int lastDigit = digits % 10;
                if (lastDigit == 2 || lastDigit == 3 || lastDigit == 5 || lastDigit == 7) {
                    total = total + lastDigit;
                }
                digits = digits / 10;
            }
        }
        System.out.println(total);
    }
}
