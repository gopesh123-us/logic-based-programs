// LBP002
import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        System.out.println("Enter an integer");
        Scanner sc = new Scanner(System.in);
        int userInput = sc.nextInt();
        if (userInput >= 0) {
            if (userInput % 2 == 0) {
                System.out.println("even");
            } else {
                System.out.println("odd");
            }
        } else {
            System.out.println("invalid");
        }
    }
}