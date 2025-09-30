    package BoolConditionals;

    import java.util.Scanner;

    public class ChallengeQuiz {

        public static void main(String[] args) {

            //See Learn the Part for the complete instructions.


            Scanner scanner = new Scanner(System.in);
            int points = 0;

            System.out.println("1. Which country held the 2016 Summer Olympics?");
            System.out.println("\ta) China\n\tb) Ireland\n\tc) Brazil\n\td) Italy\n");
            String Answer1 = scanner.nextLine();

            if (Answer1.equals("c")) {System.out.println("Your answer is correct your current score is " + (points +=5) + "points");}
                    else {
                System.out.println("You have selected a wrong answer");}

            //store answer 1

            System.out.println("\n2. Which planet is the hottest?");
            System.out.println("\ta) Venus\n\tb) Saturn\n\tc) Mercury\n\td) Mars\n");
            //store answer 2
            String Answer2 = scanner.nextLine();
            if (Answer2.equals("a")) {System.out.println("Your answer is correct your current score is " + (points +=5) + "points");}
            else {
                System.out.println("You have selected a wrong answer");}


            System.out.println("\n3. What is the rarest blood type?");
            System.out.println("\ta) O\n\tb) A\n\tc) B\n\td) AB-Negative\n");
            String Answer3 = scanner.nextLine();
            if (Answer3.equals("d")) {System.out.println("Your answer is correct your current score is " + (points += 5) + "points");}
            else {
                System.out.println("You have selected a wrong answer");}


            System.out.println("\n4. Which one of these characters is friends with Harry Potter?");
            System.out.println("\ta) Ron Weasley\n\tb) Hermione Granger\n\tc) Draco Malfoy\n");
            String Answer4 = scanner.nextLine();
            if (Answer4.equals("a") || Answer4.equals("b")) {System.out.println("Your answer is correct your current score is " + (points += 5) + "points");}
            else {
                System.out.println("You have selected a wrong answer");}


            //Task 2: Check each answer - For each correct answer, add 5 points to the score.

            System.out.println("Your final score is: " + points + "/20");

            //Task 3: print a message depending on the score
            if (points >= 15) {
                System.out.println("Wow, you know your stuff!");
            } else if (points >= 5) {
                System.out.println("Not bad!");
            } else {
                System.out.println("Better luck next time!");
            }

                    scanner.close();

                }
                }