
import java.util.Arrays;
import java.util.Scanner;

public class ReverseInteger {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String digitsString = sc.nextLine();
            int[] intArray = Arrays.stream(digitsString.split("")).mapToInt(Integer::parseInt).toArray();
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i <= (intArray.length - 1); i++) {
                sb.append(intArray[intArray.length - 1 - i]);
            }
            System.out.print(sb.toString());
        }
    }

}
