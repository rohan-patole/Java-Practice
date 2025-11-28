package Loops;

import java.util.Scanner;

public class Guess  {
    public static void main(String[] args) {

        int num = 4;
        System.out.print("I chose a number between 1 and 5. Try to guess it: ");
        Scanner scan = new Scanner(System.in);
        int guess = scan.nextInt();

        while (guess != num) {
            System.out.println("Guess again :");
            guess = scan.nextInt();
        }
        System.out.println("You got it!");
        scan.close();
    }

}
