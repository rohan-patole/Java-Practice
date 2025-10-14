package Loops;

import java.util.Scanner;

public class CounterTool {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("I hear you like to count by threes\n");
        System.out.println("Jimmy: It depends.");
        System.out.println("Oh, ok...\n");
        System.out.print("1. Pick a number to count by: " );
        int counter1 = scan.nextInt();
        System.out.print("2. Pick a number to start counting from: ");
        int counter2 = scan.nextInt();
        System.out.print("3. Pick a number to count to: ");
        int counter3 = scan.nextInt();

        for (int i= counter2; i <=counter3; i += counter1) {
            System.out.print( i + " ");
        }
        scan.close();
    }
}
