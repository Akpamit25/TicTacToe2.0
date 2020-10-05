package com.TicTacToe;

import java.util.*;
import java.lang.*;

public class TicTacToeGame {

	private static char[] board;
	private static char userMark;
	private static char computerMark;

	public static void main(String[] args) {

		board = createBoard();
		System.out.println("Enter Your Mark");
		Scanner sc = new Scanner(System.in);
		char userMark = userChoice(sc);
		char computerMark = (userMark == 'X') ? 'O' : 'X';
		showBoard(board);
		System.out.println("Enter any Index from 1 to 9");
		Scanner sc2 = new Scanner(System.in);
		int Index = sc2.nextInt();
		System.out.println("It is " + selectIndex(Index) + " that Current Position is available");
		makeMove();

	}

	private static char[] createBoard() //// CREATE Array
	{
		char[] board1 = new char[10];
		for (int i = 0; i < board1.length; i++) {
			board1[i] = ' ';

		}
		System.out.println("Board Created");
		return board1;
	}

	private static char userChoice(Scanner sc1) {
		char c = sc1.next().toUpperCase().charAt(0);
		return c;
	}

	private static void showBoard(char[] board2) {
		for (int j = 1; j < board2.length; j++) {
			System.out.print("[" + board2[j] + "]");
			if (j % 3 == 0) {
				System.out.println(" ");
				System.out.println("---------");
			}
		}
	}

	private static boolean selectIndex(int position) {
		//int position = Index.nextInt();
		if (position < 1 || position > 9) {
			System.out.println("Invalid Input, please enter again !!");
			Scanner sc3 = new Scanner(System.in);
			int Index = sc3.nextInt();
			selectIndex(Index);
		} else if (position <= 9 && position >= 1) {
			if (board[position] == ' ') {
				System.out.println("Position free to move !!");

			} else {
				System.out.println("Position already occupied, choose other position.");
				Scanner sc4 = new Scanner(System.in);
				int Index = sc4.nextInt();
				selectIndex(Index);
			}
		}
		return true;
	}

	private static void makeMove() {
		System.out.println("Enter the position number where you want to play the move");
		Scanner sc5 = new Scanner(System.in);
		int Index1 = sc5.nextInt();
		if (selectIndex(Index1)) {
			board[Index1] = userMark;
			showBoard(board);
		}
	}

}
