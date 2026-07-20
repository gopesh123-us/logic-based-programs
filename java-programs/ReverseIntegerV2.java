
import java.util.Scanner;

public class ReverseIntegerV2 {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int digits = sc.nextInt();
            int reverse = 0;

            while (digits != 0) {
                int cd = digits % 10;
                reverse = (reverse * 10) + cd;
                digits = digits / 10;
            }

            System.out.println(reverse);
        }
    }
}
