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

	private char chooseLetter() {
		System.out.println("Enter the Letter");
		return sc.next().charAt(0);
	}
	
	public static void main(String[] args) {
		System.out.println("Welcome to TicTacToe program");
		TicTacToeGame ticTacToe = new TicTacToeGame();
		ticTacToe.createBoard();
		ticTacToe.chooseLetter();
		if (player == 'X') {
			computer = 'O';
		} else {
			computer = 'X';
		}
	}
}
