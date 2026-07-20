
import java.util.Scanner;

public class IncrementByOneLBP5 {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            //System.out.println("Enter integer: \n");
            int userInput = sc.nextInt();
            if (userInput >= 0) {
                int answer = incrementByOne(userInput);
                System.out.println(answer);
            }
        }
    }

    static int incrementByOne(int num) {
        return num + 1;
    }
}
