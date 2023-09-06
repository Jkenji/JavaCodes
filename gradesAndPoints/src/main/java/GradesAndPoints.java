
import java.util.Scanner;

public class GradesAndPoints {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Give points [0-100]:");
        int grade = scan.nextInt();

        if (grade < 0) {
            System.out.println("Grade: impossible!");

        } else if (0 <= grade && grade <= 49) {
            System.out.println("Grade: failed");

        } else if (50 <= grade && grade <= 59) {
            System.out.println("Grade: 1");

        } else if (60 <= grade && grade <= 69) {
            System.out.println("Grade: 2");

        } else if (70 <= grade && grade <= 79) {
            System.out.println("Grade: 3");

        } else if (80 <= grade && grade <= 89) {
            System.out.println("Grade: 4");

        } else if (90 <= grade && grade <= 100) {
            System.out.println("Grade: 5");

        } else if (100 < grade) {
            System.out.println("Incredible!");
        }
    }
}
