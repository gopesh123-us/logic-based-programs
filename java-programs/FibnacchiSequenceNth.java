
import java.util.Scanner;

public class FibnacchiSequenceNth {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inputDigit = sc.nextInt();
        int result = findNthofFibnacchiSeries(inputDigit);
        System.out.println(result);
        sc.close();
    }

    public static Integer findNthofFibnacchiSeries(Integer n) {
        int firstDigit = 1;
        int secondDigit = 1;
        int current = 0;
        for (int i = 2; i < n; i++) {
            current = firstDigit + secondDigit;
            firstDigit = secondDigit;
            secondDigit = current;
        }
        return current;
    }
}
