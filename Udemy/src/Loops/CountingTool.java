package Loops;

import java.util.Scanner;
public class CountingTool {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Hello Timmy! choose a number to count to : ");
        int number = scan.nextInt();
        for (int i=0; i<=number; i++){
            System.out.println(i + " ");

        }
        scan.close();
    }
}
