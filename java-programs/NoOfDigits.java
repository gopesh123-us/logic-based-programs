
import java.util.Scanner;

public class NoOfDigits {

    public static void main(String[] args) {
        int total = 0;
        try (Scanner sc = new Scanner(System.in)) {
            int digits = sc.nextInt();
            int[] range = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
            while (digits != 0) {
                for (int i = 0; i < range.length; i++) {
                    if (digits % 10 == range[i]) {
                        total++;
                        break;
                    }
                }

                digits = digits / 10;
            }
        }
        System.out.println(total);
    }
}
