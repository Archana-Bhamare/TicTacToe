package com.bridgelabz.tictactoe;

import java.util.Scanner;

public class TicTacToeGame {
	public static Scanner sc = new Scanner(System.in);
	public static char player, computer;

	private void createBoard() {
		char[] board = new char[10];
		for (int i = 1; i < 10; i++) {
			board[i] = ' ';
		}
	}

	private void chooseLetter() {
		System.out.println("Enter the Letter 'X' or 'O'");
		while (true) {
			player = sc.next().charAt(0);
			if (player == 'X' || player == 'x') {
				computer = 'O';
			} else if (player == '0' || player == 'o') {
				computer = 'X';
			} else {
				System.out.println("Invalid Choice, Please enter letter 'X' or 'O'");
				continue;
			}
		}
	}

	public static void main(String[] args) {
		System.out.println("Welcome to TicTacToe program");
		TicTacToeGame ticTacToe = new TicTacToeGame();
		ticTacToe.createBoard();
		ticTacToe.chooseLetter();
	}
}
