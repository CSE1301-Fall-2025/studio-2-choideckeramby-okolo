import java.util.Scanner;

public class Ruin {
    public static void main(String[] args) {
        double winChance = .5;
        int winLimit = 20;
        for (int totalSimulations = 0; totalSimulations < 50; totalSimulations++) {
            int startAmount = 10;
            int numPlays = 0;
            while ((startAmount > 0) && (startAmount < 20)) {
                if (winChance >= Math.random()) {
                    startAmount++;
                    numPlays++;
                } else {
                    startAmount--;
                    numPlays++;

                }
                

            }
            System.out.println("Today is day " + totalSimulations);
            System.out.println("The number of plays was " + numPlays);
            if (startAmount <= 0) {
                System.out.println("You are ruined!");
            }
            if (startAmount >= 20) {
                System.out.println("You have hit your win limit!");

        }
            

            }

        

    }

}
