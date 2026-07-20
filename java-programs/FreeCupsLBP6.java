
import java.util.Scanner;

public class FreeCupsLBP6 {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int numOfCups = sc.nextInt();
            if (numOfCups >= 1) {
                int freeCups = numOfCups / 6;
                int totalCups = numOfCups + freeCups;
                System.out.println(totalCups);
            }
            sc.close();
        }
    }
}
