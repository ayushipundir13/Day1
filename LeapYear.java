package Basics.com;
import java.util.Scanner;
public class LeapYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = input.nextInt();
        if (year > 999 && year < 1000) {
            if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                System.out.println(year + " is a Leap Year");
            } else
                System.out.println(year + " is not a Leap Year");
        }
        else
            System.out.println("Enter a valid year");

    }
}
