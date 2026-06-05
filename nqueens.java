public class nqueens {
    public static void main(String[] args) {
        int n = 4; // Change this value to solve for different sizes of the board
        solveNQueens(n);
    }

    private static void solveNQueens(int n) {
        int[] queens = new int[n]; // This array will hold the column position of the queen in each row
        placeQueens(queens, 0, n);
    }

    private static void placeQueens(int[] queens, int row, int n) {
        if (row == n) {
            printBoard(queens);
            return;
        }
        for (int col = 0; col < n; col++) {
            if (isSafe(queens, row, col)) {
                queens[row] = col; // Place the queen
                placeQueens(queens, row + 1, n); // Recur to place the next queen
            }
        }
    }

    private static boolean isSafe(int[] queens, int row, int col) {
        for (int i = 0; i < row; i++) {
            if (queens[i] == col || // Check same column
                queens[i] - i == col - row || // Check upper left diagonal
                queens[i] + i == col + row) { // Check upper right diagonal
                return false;
            }
        }
        return true;
    }

    private static void printBoard(int[] queens) {
        for (int i = 0; i < queens.length; i++) {
            for (int j = 0; j < queens.length; j++) {
                if (queens[i] == j) {
                    System.out.print("Q ");
                } else {
                    System.out.print(". ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }
}
