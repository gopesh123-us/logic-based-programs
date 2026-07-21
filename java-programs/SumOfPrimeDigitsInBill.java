
/**
 * An e-commerce company plans to give their customers a special discount for the Christmas,
 * they are planning to offer a flat discount. The discount value is calculated as the sum of all prime digits in the total bill amount.
 * Write an algorithm to find the discount value for the given total bill amount.
 */
import java.util.Scanner;

public class SumOfPrimeDigitsInBill {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int digit = sc.nextInt();
            int discount = addPrimes(digit);
            System.out.println(discount);
        }
    }

    static Integer addPrimes(Integer n) {
        int r, sum = 0;
        while (n != 0) {
            r = n % 10;
            if (r == 2 || r == 3 || r == 5 || r == 7) {
                sum = r + sum;
            }
            n = n / 10;
        }
        return sum;
    }
}
