package Backtacking;

public class Sudoku {
    public static boolean isSafe(int Sudoku[][], int row, int col, int digit) {
        // column
        for (int i = 0; i <= 8; i++) {
            if (Sudoku[i][col] == digit) {
                return false;
            }
        }
        // row
        for (int j = 0; j <= 8; j++) {
            if (Sudoku[row][j] == digit) {
                return false;
            }
        }
        // grid
        int StartRow = (row / 3) * 3;
        int StartCol = (col / 3) * 3;
        for (int i = StartRow; i < StartRow + 3; i++) {
            for (int j = StartCol; j < StartCol + 3; j++) {
                if (Sudoku[i][j] == digit) {
                    return false;
                }
            }
        }

        return true;
    }

    public static boolean sudokuSolver(int Sudoku[][], int row, int col) {
        // Base Case
        if (row == 9) {
            return true;
        }

        // Recursion
        int Nextrow = row, Nextcol = col + 1;
        if (col + 1 == 9) {
            Nextrow = row + 1;
            Nextcol = 0;
        }
        if (Sudoku[row][col] != 0) {
            return sudokuSolver(Sudoku, Nextrow, Nextcol);
        }
        for (int digit = 0; digit <= 9; digit++) {
            if (isSafe(Sudoku, row, col, digit)) {
                Sudoku[row][col] = digit;
                if (sudokuSolver(Sudoku, Nextrow, Nextcol)) {// solution exist
                    return true;
                }
                Sudoku[row][col] = 0;
            }
        }
        return false;
    }

    public static void printsudoku(int Sudoku[][]) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(Sudoku[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int Sudoku[][] = {
                { 0, 0, 8, 0, 0, 0, 0, 0, 0 },
                { 4, 9, 0, 1, 5, 7, 0, 0, 2 },
                { 0, 0, 0, 0, 0, 4, 1, 9, 0 },
                { 1, 8, 5, 0, 6, 0, 0, 2, 0 },
                { 0, 0, 0, 0, 2, 0, 0, 6, 0 },
                { 9, 6, 0, 4, 0, 5, 3, 0, 0 },
                { 0, 3, 0, 0, 7, 2, 0, 0, 4 },
                { 0, 4, 9, 0, 3, 0, 0, 5, 7 },
                { 8, 2, 7, 0, 0, 9, 0, 1, 3 } };
        // function prints initial sudoku
        System.out.println("----------------Initial Sudoku--------------");
        printsudoku(Sudoku);

        if (sudokuSolver(Sudoku, 0, 0)) {
            System.out.println("----------------Solution exist--------------");
            printsudoku(Sudoku);
        } else {
            System.out.println("Solution doesn't exist");
        }

    }

}