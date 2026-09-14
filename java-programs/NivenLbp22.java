
import java.util.Scanner;

public class NivenLbp22 {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            Integer input = scanner.nextInt();
            boolean result = isNiven(input);
            System.out.println(result == true ? "Yes" : "No");
        }

    }

    protected static boolean isNiven(Integer input) {
        int original = input;
        Boolean isNiven = false;
        int sum = 0;
        while (input != 0) {
            int current = input % 10;
            sum = current + sum;
            input = input / 10;
        }

        if (original % sum == 0) {
            isNiven = true;
        }
        return isNiven;
    }
}
