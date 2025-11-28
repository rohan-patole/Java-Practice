package Loops;
import java.util.Scanner;
public class SignIn {

    public static void main(String[] args) {
        String username = "Rohan";
        String password = "admin";

        Scanner scan = new Scanner(System.in);
        System.out.println("\nWelcome to Javagram! Sign in below\n");
        System.out.print("- Username: ");
        String name = scan.nextLine();
        System.out.print("- Password: ");
        String pwd = scan.nextLine();
        // see Learn the Part for the remaining instructions.

        while (!name.equals(username) || !pwd.equals(password)) {
            System.out.println("\nIncorrect, please try again!\n");
            System.out.print("- Username: ");
            name = scan.nextLine();
            System.out.print("- Password: ");
            pwd = scan.nextLine();

        }
        System.out.println("\nSign in successful. Welcome!");

        scan.close();

    }
}