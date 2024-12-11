import java.util.Scanner;
import java.util.Random;

class MazeGame extends SpecialMazeGame {

    public MazeGame(int mazeSize) {
        super(mazeSize);
    }

    
    @Override
    public void startGame() {
        System.out.println("Welcome to the Maze Game!");
        System.out.println("Answer the math questions to navigate the maze.");
        System.out.println("- Correct answers move you RIGHT.");
        System.out.println("- Incorrect answers move you LEFT.");
        System.out.println("Reach position " + (mazeSize - 1) + " to win!\n");

        Random random = new Random();

       
        while (playerPosition >= 0 && playerPosition < mazeSize) {
            displayMaze(); 
            
            int num1 = random.nextInt(10) + 1;
            int num2 = random.nextInt(10) + 1;
            int correctAnswer = num1 + num2; 

            System.out.print("What is " + num1 + " + " + num2 + "? ");
            int playerAnswer = 0;

            if (scanner.hasNextInt()) {
                playerAnswer = scanner.nextInt();
            } else {
                System.out.println("Invalid input! Moving LEFT.");
                scanner.nextLine(); 
                playerAnswer = Integer.MIN_VALUE; 
            }

           
            if (playerAnswer == correctAnswer) {
                System.out.println("Correct! Moving RIGHT.");
                playerPosition++;
            } else {
                System.out.println("Incorrect. Moving LEFT.");
                playerPosition--;
            }

           
            if (playerPosition < 0) {
                System.out.println("You fell out of the maze! Game over.");
                break;
            } else if (playerPosition >= mazeSize) {
                System.out.println("Congratulations! You reached the end of the maze and won!");
                break;
            }

            scanner.nextLine(); 
        }

        scanner.close();
    }
}
