
import java.util.Scanner;

public class SumofDigits {

    public static void main(String[] args) {
        int total = 0;
        try (Scanner sc = new Scanner(System.in)) {
            int digits = sc.nextInt();
            while (digits != 0) {
                total = total + (digits % 10);
                digits = digits / 10;
            }
        }
        System.out.println(total);
    }
}
