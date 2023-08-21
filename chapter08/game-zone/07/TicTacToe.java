/*
Farrel Joyce - Java Programming, 10th Edition (2023)

Chapter 08, Game Zone 7a

Task:
Create a Tic Tac Toe game. In this game, two players alternate placing Xs and Os into a grid until
one player has three matching symbols in a row, horizontally, vertically, or diagonally. Create a
game in which the user is presented with a three-by-three grid containing the digits 1 through 9.
When the user chooses a position by typing a number, place an X in the appropriate spot. Generate
a random number for the position where the computer will place an O. Do not allow the player or
the computer to place a symbol where one has already been placed. Figure 8-46 shows the first four
windows in a typical game. When either the player or computer has three symbols in a row, declare
a winner; if all positions have been exhausted and no one has three symbols in a row, declare a tie.
Save the game as TicTacToe.java.

Written by: Jakov Milas
https://github.com/JakovMilas/java-farell-joyce-10th-edition
*/


import javax.swing.JOptionPane;
import java.util.Random;

public class TicTacToe
{
	public static void main(String[] args)
	{
		char[][] board = {{'1', '2', '3'},
				  {'4', '5', '6'},
				  {'7', '8', '9'}};
		final int PLAY = 0;
		final int PLAYER_WIN = 1;
		final int COMPUTER_WINS = 2;
		int gameStatus = PLAY;
		boolean isPlayer = true;
		
		JOptionPane.showMessageDialog(null, printBoard(board) +
				"You will have X and computer will have  O", "Tic Tac Toe", 1);
		while(gameStatus == PLAY)
		{
			gameStatus = play(board, playerTurn(board), isPlayer);
			isPlayer = false;
			if(gameStatus == PLAY)
			{
				JOptionPane.showMessageDialog(null, "Well played, now computer will play",
						"Tic Tac Toe", 1);
				gameStatus = play(board, computerTurn(board), isPlayer);
				isPlayer = true;
			}
		}
		if(gameStatus == PLAYER_WIN)
			JOptionPane.showMessageDialog(null, printBoard(board) + "You win!",
					"Tic Tac Toe", 1);
		else
			if(gameStatus == COMPUTER_WINS)
				JOptionPane.showMessageDialog(null, printBoard(board) +
						"Computer wins!", "Tic Tac Toe", 1);
		else
			JOptionPane.showMessageDialog(null, printBoard(board) + "It's a tie!",
					"Tic Tac Toe", 1);

	}
	public static String printBoard(char[][] board)
	{
		String str = "";
		for(char[] row : board)
		{
			for(char c : row)
				str += "       " + c + "     ";
			str += "\n\n";
		}
		return str;
	}
	public static int computerTurn(char[][] board)
	{
		Random random = new Random();
		int position = random.nextInt(9) + 1;
		while(isPositionTaken(board, position))
			position = random.nextInt(9) + 1;
		JOptionPane.showMessageDialog(null, "Computer has played " + position,
				"Tic Tac Toe", 1);
		return position;
	}
	public static int playerTurn(char[][] board)
	{
		String entry = JOptionPane.showInputDialog(null, printBoard(board) +
				"Your turn, enter position", "Tic Tac Toe", 1);
		int position = Integer.parseInt(entry);
		if(isPositionTaken(board, position))
		{
			JOptionPane.showMessageDialog(null, "Position already taken", "Tic Tac Toe", 1);
			position = playerTurn(board);
		}
		return position;
	}
	public static boolean isPositionTaken(char[][] board, int position)
	{
		int row = (position - 1) / 3;
		int col = (position - 1) % 3;
		if(!Character.isDigit(board[row][col]))
			return true;
		return false;
	}
	public static int play(char[][] board, int position, boolean isPlayer)
	{
		int gameStatus = 0;
		char mark;
		if(isPlayer)
			mark = 'X';
		else
			mark = 'O';
		int row = (position - 1) / 3;
		int col = (position - 1) % 3;
		board[row][col] = mark;
		for(int x = 0; x < 3 && gameStatus == 0; x++)
		{
			if(board[x][0] == mark && board[x][1] == mark && board[x][2] == mark)
				if(isPlayer)
					gameStatus = 1;
				else
					gameStatus = 2;
			else
				if(board[0][x] == mark && board[1][x] == mark && board[2][x] == mark)
					if(isPlayer)
						gameStatus = 1;
					else
						gameStatus = 2;
		}
		if(gameStatus == 0)
			if(board[0][0] == mark && board[1][1] == mark && board[2][2] == mark)
				if(isPlayer)
					gameStatus = 1;
				else
					gameStatus = 2;
			else
				if(board[0][2] == mark && board[1][1] == mark && board[2][0] == mark)
					if(isPlayer)
						gameStatus = 1;
					else
						gameStatus = 2;
			else
			{
				boolean isPlay = false;
				for(int x = 0; x < board.length; x++)
					for (int y = 0; y < board[x].length && !isPlay; y++)
						if(!Character.isLetter(board[x][y]))
							isPlay = true;
				if(!isPlay)
					gameStatus = 3;
			}
		return gameStatus;
	}
}
