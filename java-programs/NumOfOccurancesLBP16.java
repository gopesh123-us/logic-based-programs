
import java.util.Scanner;

public class NumOfOccurancesLBP16 {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int digits = sc.nextInt();
            int key = sc.nextInt();
            int counter = 0;
            while (digits != 0) {
                int ld = digits % 10;
                if (ld == key) {
                    counter++;
                }
                digits = digits / 10;
            }
            System.out.println(counter);

        }
    }
}
