
import java.util.Scanner;

public class SumDivisibleByThree {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int digits = sc.nextInt();
            int total = 0;
            while (digits != 0) {
                if (digits % 10 % 3 == 0) {
                    total = total + (digits % 10);
                }
                digits = digits / 10;
            }
            System.out.println(total);
        }
    }
}
