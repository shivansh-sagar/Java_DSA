package Backtacking;

public class RatInMAZE {
    public static boolean isSafe(int maze[][], int x, int y) {
        if (x >= 0 && x < maze.length && y >= 0 && y < maze.length && maze[x][y] == 1) {
            return true;
        }
        return false;
    }

    public static boolean RatMaze(int maze[][], int x, int y, int sol[][]) {
        // Base Case
        if (x == maze.length - 1 && y == maze.length - 1) {
            sol[x][y] = 1;
            return true;
        }

        if (isSafe(maze, x, y)) {
            sol[x][y] = 1;

            // Right
            if (RatMaze(maze, x + 1, y, sol)) {
                return true;
            }

            // Down
            if (RatMaze(maze, x, y + 1, sol)) {
                return true;
            }
            sol[x][y] = 0;
            return false;

        }
        return false;
    }

    public static void printmaze(int maze[][]) {
        for (int i = 0; i < maze.length; i++) {
            for (int j = 0; j < maze.length; j++) {
                System.out.print(maze[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int maze[][] = {
                { 1, 0, 0, 0 },
                { 1, 1, 1, 1 },
                { 0, 0, 0, 1 },
                { 1, 1, 1, 1 }
        };
        System.out.println("------------Initail maze-----------");
        printmaze(maze);
        
        int sol[][] = {
                { 0, 0, 0, 0 },
                { 0, 0, 0, 0 },
                { 0, 0, 0, 0 },
                { 0, 0, 0, 0 }
        };
        System.out.println("------------Final maze-----------");
        if (RatMaze(maze, 0, 0, sol)) {
            printmaze(sol);
        }
    }
}
