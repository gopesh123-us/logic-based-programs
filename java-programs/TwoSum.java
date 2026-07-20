
import java.util.Scanner;

public class TwoSum {

    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 6, 4, 7};
        System.out.println(arr.length);
        try (Scanner sc = new Scanner(System.in)) {
            int target = sc.nextInt();
            for (int i = 0; i < arr.length - 1; i++) {
                for (int j = 0 + 1; j < arr.length - 1; j++) {
                    if (arr[i] + arr[j] == target) {
                        System.out.println(i + " " + j);
                    }
                }

            }
        }
    }
}
