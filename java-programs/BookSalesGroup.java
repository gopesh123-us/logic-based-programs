
import java.util.Scanner;

public class BookSalesGroup {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sales = sc.nextInt();
        String group = findGroup(sales);
        System.out.println(group);
        //System.out.println("For sales of " + sales + " the group is: " + group);
    }

    static String findGroup(int sales) {

        if (sales >= 30 && sales <= 100) {
            if (sales >= 30 && sales <= 50) {
                return "D";
            } else if (sales >= 51 && sales <= 60) {
                return "C";
            } else if (sales >= 61 && sales <= 80) {
                return "B";
            } else {
                return "A";
            }
        }
        return "";
    }
}
