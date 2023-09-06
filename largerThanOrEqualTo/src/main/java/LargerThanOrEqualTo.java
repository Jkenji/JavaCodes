
import java.util.Scanner;

public class LargerThanOrEqualTo {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Give the first number:");
        int first = scan.nextInt();

        System.out.println("Give the second number:");
        int second = scan.nextInt();

        if (first > second) {
            System.out.printf("Greater number is: %d", first);
        } else if (second > first) {
            System.out.printf("Greater number is: %d", second);
        } else {
            System.out.println("The numbers are equal!");
        }

    }
}
