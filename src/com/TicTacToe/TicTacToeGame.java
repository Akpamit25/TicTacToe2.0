package com.TicTacToe;

import java.util.*;
import java.lang.*;

public class TicTacToeGame {

	private static char[] board;
	private static char userMark;
	private static char computerMark;

	public static void main(String[] args) {
		TicTacToeGame TTTG = new TicTacToeGame();
		board = TTTG.createBoard();
		TTTG.showBoard(board);
		//System.out.println("Enter Your Mark");
		System.out.println("Let's Toss");
		TTTG.toss();
		// char userMark = userChoice();
		//char computerMark = (userMark == 'X') ? 'O' : 'X';
		
		System.out.println("Enter any Index from 1 to 9");
		Scanner sc2 = new Scanner(System.in);
		int Index = sc2.nextInt();
		TTTG.checkIndex(Index);
			TTTG.makeMove();
		
		

	}

	private static char[] createBoard() //// CREATE Array
	{
		char[] board1 = new char[10];
		for (int i = 0; i < board1.length; i++) {
			board1[i] = ' ';

		}
		//System.out.println("Board Created");
		//System.out.println(" ");
		return board1;
	}

	private static char userChoice() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter User's Choice, Either 'X' Or 'O'");
		String c = sc.next();
		char c1 = c.toUpperCase().charAt(0);
		char computerMark = (userMark == 'X') ? 'O' : 'X';
		return c1;
	}

	private static char computerChoice() {
		System.out.println("Enter Computer's Choice, Either 'X' Or 'O'");
		Scanner sc = new Scanner(System.in);
		String c = sc.next();
		char c1 = c.toUpperCase().charAt(0);
	
		return c1;
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

	private static boolean checkIndex(int position) {
		// int position = Index.nextInt();
		if (position < 1 || position > 9) {
			System.out.println("Invalid Input, please enter again !!");
			Scanner sc3 = new Scanner(System.in);
			int Index = sc3.nextInt();
			checkIndex(Index);
		} else if (position <= 9 && position >= 1) {
			if (board[position] == ' ') {
				System.out.println("Position free to move !!");

			} else {
				System.out.println("Position already occupied, choose other position.");
				Scanner sc4 = new Scanner(System.in);
				int Index = sc4.nextInt();
				checkIndex(Index);
			}
		}
		return true;
	}

	private static void makeMove() {
		
		System.out.println("Enter the position number where you want to play the move");
		Scanner sc5 = new Scanner(System.in);
		int Index1 = sc5.nextInt();
		if (checkIndex(Index1)) {
			board[Index1] = userMark;
			//showBoard(board);
		}
		showBoard(board);
	}

	private static void toss() {
	
		int max = 3;
		int min = 1;
		int range = max - min ;
		int rand = (int) (Math.random() * range);
		char rand1 = (char) rand;
		if (rand == 0) {
			System.out.println("Computer Will Start The Game");
			computerMark = computerChoice();
			userMark = (computerMark == 'X') ? 'O' : 'X';

		} else if (rand == 1) {
			System.out.println("User Will Start The Game");
			userMark = userChoice();
			computerMark = (userMark == 'X') ? 'O' : 'X';
		}

		// return rand;

	}

}
