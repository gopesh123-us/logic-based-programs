
import java.util.Scanner;

public class ExtractDigitsLBP7 {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int digits = sc.nextInt();
            String digitsString = Integer.toString(digits);
            for (int i = digitsString.length() - 1; i >= 0; i--) {
                System.out.print((digitsString.charAt(i) + " "));
            }
        }
    }
}
