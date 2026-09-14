
import java.util.Scanner;

public class SpecialTwoDigitNumberLbp23 {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int original, input, add, prod;
            int firstDigit, secondDigit;
            input = scanner.nextInt();
            original = input;
            firstDigit = input % 10;
            input = input / 10;
            secondDigit = input % 10;

            add = firstDigit + secondDigit;
            prod = firstDigit * secondDigit;

            if (original == (add + prod)) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }

    }
}
