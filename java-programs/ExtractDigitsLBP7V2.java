
import java.util.Scanner;

public class ExtractDigitsLBP7V2 {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            int num = sc.nextInt();
            while (num != 0) {
                int digit = num % 10;
                System.out.print(digit + " ");
                num = num / 10;
            }
        }
    }
}
