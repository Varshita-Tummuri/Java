import java.util.Scanner;

public class TicTacToe {

    static char[][] board = new char[3][3];
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean playAgain;

        System.out.println("Welcome to Tic-Tac-Toe!");
        do {
            initializeBoard();
            playGame();
            playAgain = askPlayAgain();
        } while (playAgain);

        System.out.println("Thanks for playing!");
    }

    static void initializeBoard() {
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                board[i][j] = ' ';
    }

    static void displayBoard() {
        System.out.println("-------------");
        for (int i = 0; i < 3; i++) {
            System.out.print("| ");
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " | ");
            }
            System.out.println("\n-------------");
        }
    }

    static void playGame() {
        char currentPlayer = 'X';
        int moves = 0;
        boolean gameWon = false;

        while (moves < 9 && !gameWon) {
            displayBoard();
            System.out.println("Player " + currentPlayer + ", enter your move (row [1-3] and column [1-3]): ");
            int row = scanner.nextInt() - 1;
            int col = scanner.nextInt() - 1;

            if (isValidMove(row, col)) {
                board[row][col] = currentPlayer;
                moves++;

                if (checkWin(currentPlayer)) {
                    displayBoard();
                    System.out.println("Player " + currentPlayer + " wins!");
                    gameWon = true;
                } else if (moves == 9) {
                    displayBoard();
                    System.out.println("It's a draw!");
                } else {
                    currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
                }

            } else {
                System.out.println("Invalid move! Try again.");
            }
        }
    }

    static boolean isValidMove(int row, int col) {
        return (row >= 0 && row < 3 && col >= 0 && col < 3 && board[row][col] == ' ');
    }

    static boolean checkWin(char player) {
        // Check rows and columns
        for (int i = 0; i < 3; i++)
            if ((board[i][0] == player && board[i][1] == player && board[i][2] == player) ||
                (board[0][i] == player && board[1][i] == player && board[2][i] == player))
                return true;

        // Check diagonals
        if ((board[0][0] == player && board[1][1] == player && board[2][2] == player) ||
            (board[0][2] == player && board[1][1] == player && board[2][0] == player))
            return true;

        return false;
    }

    static boolean askPlayAgain() {
        System.out.print("Do you want to play again? (yes/no): ");
        String response = scanner.next().toLowerCase();
        return response.startsWith("y");
    }
}
