
import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //System.out.println("Enter the year to check leap year\n");
        int year = sc.nextInt();
        System.out.println(isLeapYear(year));
        sc.close();
    }

    static String isLeapYear(int year) {
        String isLeapYear = "False";
        if (year % 4 == 0) {
            isLeapYear = "True";
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    isLeapYear = "True";
                } else {
                    isLeapYear = "False";
                }
            }
        }
        return isLeapYear;
    }
}
