import java.util.Scanner;

public class NumberGuess {
    public static void main(String[] args) {
        int menuRun = 1;
        Scanner scan = new Scanner(System.in);
        while (menuRun == 1) {
            // start menu
            System.out.println("Start game? (y/n)");
            String answer = scan.next();
            switch (answer) {
                case "y":
                    menuRun = 0;
                    break;
                case "n":
                    System.exit(0);
            }
        }

        System.out.println("Guess the number!");

        int trueNumber = (int) (Math.random() * 100);
        int gameRun = 1;
        while (gameRun == 1) {
            // start game
            int guessNumber = scan.nextInt();

            if (guessNumber == trueNumber) {
                gameRun = 0;
                System.out.printf("You win! The number is %d \n", trueNumber);
            }
            else if (guessNumber > trueNumber) {
                System.out.println("Your's number is too big!");
            }
            else {
                System.out.println("Your's number is too small!");
            }

        }
    }
}
