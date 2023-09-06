import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Value of the gift?");
        double input = scan.nextDouble();

        double tax1 = (100 + (input - 5000) * 0.08);
        double tax2 = (1700 + (input - 25000) * 0.1);
        double tax3 = (4700 + (input - 55000) * 0.12);
        double tax4 = (22100 + (input - 200000) * 0.15);
        double tax5 = (142100 + (input - 1000000) * 0.17);

        if (input < 5000) {
            System.out.println("No tax!");
        } else if (input >= 5000 && input < 25000) {
            System.out.println("Tax: " + tax1);
        } else if (input >= 25000 && input < 55000) {
            System.out.println("Tax: " + tax2);
        } else if (input >= 55000 && input < 200000) {
            System.out.println("Tax: " + tax3);
        } else if (input >= 200000 && input < 1000000) {
            System.out.println("Tax: " + tax4);
        } else if (input >= 1000000) {
            System.out.println("Tax: " + tax5);
        }

    }
}
