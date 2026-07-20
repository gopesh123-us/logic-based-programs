import java.util.Scanner;

public class CheckBirthDay {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in);) {
            String month = sc.next();
            int day = sc.nextInt();
            int result = check(month, day);
        System.out.println(result);
        }    
    }

    public static int check(String month, int day) {
        if(month.equalsIgnoreCase("July") && day == 5) {
            return 1;
        } else 
            return 0;
    }
}