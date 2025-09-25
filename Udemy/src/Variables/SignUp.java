package Variables;

import java.util.Scanner;

public class SignUp {

        public static void main(String[] args) {

            int counter = 0;

            System.out.println("Welcome to JavaGram! Let's sign you up.");

            Scanner scanner = new Scanner(System.in);

            System.out.println("What is your first name?");
            String firstName = scanner.nextLine();
            counter++;


            System.out.println("What is your last name?");
            String lastName = scanner.nextLine ();
            counter++;

            System.out.println("How old are you?");
            int age = scanner.nextInt();
            counter++;

            scanner.nextLine();
            System.out.println("Make a username");
            String userName = scanner.nextLine();
            counter++;

            System.out.println("What city do you live in?");
            String city = scanner.nextLine();
            counter++;

            System.out.println("What country is that?");
            String country = scanner.nextLine();
            counter++;

            scanner.close();

            System.out.println("Thank you for joining JavaGram! and answering all the " + counter + "questions");
            System.out.println("\nHere is the information you entered:");
            System.out.println("\tFirst Name: " + firstName);
            System.out.println("\tLast Name: " + lastName);
            System.out.println("\tAge:" + age);
            System.out.println("\tUsername: " +(firstName+lastName)+"_" +age);
            System.out.println("\tCity:" + city);
            System.out.println("\tCountry: " + country);

    }
}
