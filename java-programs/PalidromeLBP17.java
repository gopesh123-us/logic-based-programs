
import java.util.Scanner;

public class PalidromeLBP17 {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String digitString = sc.nextLine();
            int flag = 0;
            int numOfDigits = noOfDigits(digitString);
            for (int i = 0; i < numOfDigits - 1; i++) {
                if (digitString.charAt(i) == digitString.charAt(numOfDigits - 1 - i)) {

                } else {
                    flag = 1;
                }
            }
            if (flag == 0) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }

    public static int noOfDigits(String digitString) {
        return digitString.length();
    }
}
