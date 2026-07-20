
import java.util.Scanner;

public class PaliandronmeLBP17 {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int digits = sc.nextInt();
            int reverse = getReverse(digits);
            if (digits == reverse) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }

    public static int getReverse(int digits) {
        int reverse = 0;
        while (digits != 0) {
            int ld = digits % 10;
            reverse = reverse * 10 + ld;
            digits = digits / 10;
        }
        return reverse;
    }
}
