package com.TicTacToe;

import java.util.*;
import java.lang.*;

public class TicTacToeGame {

	public static void main(String[] args) {
		char[] board;
		board = createBoard();
		System.out.println("Enter Your Mark");
		Scanner sc = new Scanner(System.in);
		char userMark = userChoice(sc);
		char computerMark = (userMark == 'X') ? 'O' : 'X';

	}

	private static char[] createBoard()  ////CREATE Array
	{
		char[] board1 = new char[10];
		for (int i = 0; i < board1.length; i++) {
			board1[i] = ' ';
		}
		return board1;
	}
	
	private static char userChoice(Scanner sc1)
	{
		char c = sc1.next().toUpperCase().charAt(0);
		return c;
	}
	
	
	
}
