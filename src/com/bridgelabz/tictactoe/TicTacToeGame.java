package com.bridgelabz.tictactoe;

public class TicTacToeGame {
	private void createBoard() {
		char[] board = new char[10];
		for (int i = 1; i < 10; i++) {
			board[i] = ' ';
		}
	}

	public static void main(String[] args) {
		System.out.println("Welcome to TicTacToe program");
		TicTacToeGame ticTacToe = new TicTacToeGame();
		ticTacToe.createBoard();
	}
}
