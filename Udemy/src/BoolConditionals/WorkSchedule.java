package BoolConditionals;

public class WorkSchedule {
    public static void main(String[] args) {
        //See Learn the Part for the complete instructions (link in resources folder of Udemy video).

        int day = 5;   //3rd day of the week...
        boolean holiday = false;

        if (holiday) {
            System.out.println("woohoo, no work!");
        } else if (day == 6 || day == 7) {
            System.out.println("Its the weekend,no work!");
        } else {
            System.out.println("Wake up at 7AM!");
        }
    }
}