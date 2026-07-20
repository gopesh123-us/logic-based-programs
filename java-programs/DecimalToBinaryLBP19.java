
import java.util.Scanner;

public class DecimalToBinaryLBP19 {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            int decimalInput = sc.nextInt();
            String remainder = "";
            while (decimalInput > 0) {
                remainder = String.valueOf(decimalInput % 2) + remainder;
                decimalInput = decimalInput / 2;
            }
            System.out.println(remainder);
        }
    }

}
