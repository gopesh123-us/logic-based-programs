import java.util.Scanner;

public class AddThree {
  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      System.out.println("Enter three integers");
      int a = sc.nextInt();
      int b = sc.nextInt();
      int c = sc.nextInt();
      int sum = a + b + c;
      System.out.println("Sum: " + sum);
    }
  }
}