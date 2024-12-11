import java.util.Scanner;
import java.util.Random;

abstract class SpecialMazeGame {
    protected int playerPosition;
    protected final int mazeSize;
    protected final Scanner scanner;

    public SpecialMazeGame(int mazeSize) {
        this.mazeSize = mazeSize;
        this.playerPosition = 0;
        this.scanner = new Scanner(System.in); 
    }

    public abstract void startGame();

  
    protected void displayMaze() {
        String maze = "";
        for (int i = 0; i < mazeSize; i++) {
            if (i == playerPosition) {
                maze += "[P]"; 
            } else {
                maze += "[ ]";
            }
        }
        System.out.println("Maze: " + maze);
    }
}
