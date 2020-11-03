package com.bridgelabz.tictactoe;

import java.util.Arrays;
import java.util.Scanner;

public class TicTacToeGame {
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

	private static void showBoard(char[] board) {

		System.out.println(board[1] + " | " + board[2] + " | " + board[3]);
		System.out.println("---------");
		System.out.println(board[4] + " | " + board[5] + " | " + board[6]);
		System.out.println("---------");
		System.out.println(board[7] + " | " + board[8] + " | " + board[9]);
		System.out.println("---------");
	}

	private static int makeMove(char[] board, char player) {
		Integer[] values = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		while (true) {
			System.out.println("Enter the number between 1 and 9");
			int location = sc.nextInt();
			if (Arrays.asList(values).contains(location) && checkIndexFree(board, location)) {
				return location;
			}
		}
	}

	private static boolean checkIndexFree(char[] board, int location) {
		return board[location] == ' ';
	}

	public static void main(String[] args) {
		System.out.println("Welcome to TicTacToe program");
		TicTacToeGame ticTacToe = new TicTacToeGame();
		char[] board = ticTacToe.createBoard();
		ticTacToe.chooseLetter();
		showBoard(board);
		makeMove(board, player);
	}
}
