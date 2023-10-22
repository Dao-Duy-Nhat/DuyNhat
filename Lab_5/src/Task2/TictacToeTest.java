package Task2;

public class TictacToeTest {
	public static void main(String[] args) {
		TicTacToe checkRow = new TicTacToe();

		checkRow.makeMove(0, 0, 'X');
		checkRow.makeMove(0, 1, 'X');
		checkRow.makeMove(1, 0, 'O');
		checkRow.makeMove(1, 1, 'O');
		checkRow.makeMove(0, 2, 'X');

		System.out.println("Trường hợp chiến thắng theo hàng ngang: ");
		checkRow.printBoard();

		System.out.println("X thắng: " + checkRow.checkRows('X'));
		System.out.println("X thua: " + checkRow.checkRows('O'));

		TicTacToe checkColumns = new TicTacToe();

		checkColumns.makeMove(0, 0, 'O');
		checkColumns.makeMove(0, 1, 'X');
		checkColumns.makeMove(1, 0, 'O');
		checkColumns.makeMove(1, 1, 'X');
		checkColumns.makeMove(2, 0, 'O');

		System.out.println("Trường hợp chiến thắng theo hàng dọc: ");
		checkColumns.printBoard();
		System.out.println("O thắng: " + checkColumns.checkColumns('O'));
		System.out.println("O thua: " + checkColumns.checkColumns('X'));

		TicTacToe checkDiagonals = new TicTacToe();

		checkDiagonals.makeMove(0, 0, 'X');
		checkDiagonals.makeMove(0, 1, 'O');
		checkDiagonals.makeMove(0, 2, 'O');
		checkDiagonals.makeMove(1, 0, 'O');
		checkDiagonals.makeMove(1, 1, 'X');
		checkDiagonals.makeMove(0, 2, 'X');
		checkDiagonals.makeMove(2, 2, 'X');

		System.out.println("Trường hợp chiến thắng theo hàng chéo: ");
		checkDiagonals.printBoard();

		System.out.println("X thắng: " + checkDiagonals.checkDiagonals('X'));
		System.out.println("X thua: " + checkDiagonals.checkDiagonals('O'));

		TicTacToe checkTheTrench = new TicTacToe();

		checkTheTrench.makeMove(0, 0, 'X');
		checkTheTrench.makeMove(0, 1, 'X');
		checkTheTrench.makeMove(0, 2, 'X');
		checkTheTrench.makeMove(2, 0, 'O');
		checkTheTrench.makeMove(2, 1, 'O');
		checkTheTrench.makeMove(2, 2, 'O');

		System.out.println("Trường hợp hòa: ");
		checkTheTrench.printBoard();

		if (checkTheTrench.checkRows('X') || checkTheTrench.checkColumns('X') || checkTheTrench.checkDiagonals('X')
			&& checkTheTrench.checkRows('O') || checkTheTrench.checkColumns('O')
			|| checkTheTrench.checkDiagonals('O')) {
			System.out.println("Hòa");
		
	}
	}

}
