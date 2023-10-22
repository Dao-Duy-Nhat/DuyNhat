package Task2;

public class TicTacToe {
	private static final char EMPTY = ' ';
	private char[][] board;

	public TicTacToe() {
		board = new char[3][3];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				board[i][j] = EMPTY;
			}
		}
	}

	/*
	* This method checks all rows and returns true if any of
	them are marked with
	* all of a single player's markers.
	* Otherwise, returns false.
	*/
	public boolean checkRows(char player) {
		for (int i = 0; i < board.length; i++) {
			if (board[i][0] == player && board[i][1] == player && board[i][2] == player) {
				return true;
			}
		}
		return false;
	}

	/*
	* This method checks all columns and returns true if any
	of them are marked
	* with all of a single player's.
	* Otherwise, returns false.
	*/
	public boolean checkColumns(char player) {
		for (int i = 0; i < board.length; i++) {
			if (board[0][i] == player && board[1][i] == player && board[2][i] == player) {
				return true;
			}
		}
		return false;
	}
	
	/*
	* This method checks both diagonals and returns true if
	any of them are marked
	* with all of a single player's markers. Otherwise,
	returns false.
	*/
	public boolean checkDiagonals(char player) {
		if (board[0][0] == player && board[1][1] == player && board[2][2] == player
				|| board[2][0] == player && board[1][1] == player && board[0][2] == player) {
			return true;
		}

		return false;
	}

	// Check the moves on the chessboard:
	public void makeMove(int row, int col, char player) {
		if (row >= 0 && row < 3 && col >= 0 && col < 3 && board[row][col] == EMPTY) {
			board[row][col] = player;
		}
	}

	// Print out the moves on the chessboard:
	public void printBoard() {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(board[i][j]);
				if (j < 2) {
					System.out.print(" | ");
				}
			}
			System.out.println();
			if (i < 2) {
				System.out.println("---------");
			}
		}
		System.out.println();
	}

	
}