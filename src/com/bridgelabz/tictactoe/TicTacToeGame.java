package com.bridgelabz.tictactoe;

import java.util.Scanner;

public class TicTacToeGame {
	// private static final char[] board;
	public static Scanner sc = new Scanner(System.in);
	public static char player, computer;

	private char[] createBoard() {
		char[] board = new char[10];
		for (int i = 1; i < 10; i++) {
			board[i] = ' ';
		}
		return board;
	}

	private void chooseLetter() {
		System.out.println("Enter the Letter 'X' or 'O'");
		// while (true) {
		player = sc.next().charAt(0);
		if (player == 'X' || player == 'x') {
			computer = 'O';
		} else if (player == '0' || player == 'o') {
			computer = 'X';
		} else {
			System.out.println("Invalid Choice, Please enter letter 'X' or 'O'");
			player = sc.next().charAt(0);
		}
	}//

	private void showBoard(char[] board) {

		System.out.println(board[1] + " | " + board[2] + " | " + board[3]);
		System.out.println("---------");
		System.out.println(board[4] + " | " + board[5] + " | " + board[6]);
		System.out.println("---------");
		System.out.println(board[7] + " | " + board[8] + " | " + board[9]);
		System.out.println("---------");

	}

	public static void main(String[] args) {
		System.out.println("Welcome to TicTacToe program");
		TicTacToeGame ticTacToe = new TicTacToeGame();
		char[] board = ticTacToe.createBoard();
		ticTacToe.chooseLetter();
		ticTacToe.showBoard(board);
	}
}
