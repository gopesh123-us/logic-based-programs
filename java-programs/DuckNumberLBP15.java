
import java.util.Scanner;

public class DuckNumberLBP15 {

    public static void main(String[] args) {
        //get digits
        try (Scanner sc = new Scanner(System.in)) {
            int digits = sc.nextInt();
            int flag = 0;
            while (digits != 0) {
                int ld = digits % 10;
                if (ld == 0) {
                    flag = 1;
                    break;
                }
                digits = digits / 10;
            }
            if (flag > 0) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}
