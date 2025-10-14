package Loops;

public class Beer {
    public static void main(String[] args) {
        for (int i = 99; i >0; i--) {
            sings(i);
        }
    }

    public static void sings (int i) {
        System.out.println(i + " bottles of beer on the wall, " + i + " bottles of beer! " +
                "take one down, pass it around " + (i-1) + ", bottles of beer on the wall!");
    }
}
