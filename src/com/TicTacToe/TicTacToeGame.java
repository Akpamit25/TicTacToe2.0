package com.TicTacToe;

import java.util.*;
import java.lang.*;

public class TicTacToeGame {
	
	private static char[] board;
	
	public static void main(String[] args) {
		
		board = createBoard();
		System.out.println("Enter Your Mark");
		Scanner sc = new Scanner(System.in);
		char userMark = userChoice(sc);
		char computerMark = (userMark == 'X') ? 'O' : 'X';
		showBoard(board);
		System.out.println("Enter any Index from 1 to 9");
		Scanner sc2 = new Scanner(System.in);
		System.out.println("Current Position :"+selectIndex(sc2));

	}

	private static char[] createBoard() //// CREATE Array
	{
		char[] board1 = new char[10];
		for (int i = 0; i < board1.length; i++) {
			board1[i] = ' ';
		}
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
	
	private static int selectIndex(Scanner Index)
	{    int position = Index.nextInt();
		if(position <1 || position >9)
		{
			System.out.println("Invalid Input, please enter again !!");
			Scanner sc3 = new Scanner(System.in);
			selectIndex(sc3);
		}
		else if(position <=9 && position >=1)
		{   
			if(board[position] == ' ')
			{
				System.out.println("Position free to move !!");
				
			}
			else 
			{
				System.out.println("Position already occupied, choose other position.");
				Scanner sc4 = new Scanner(System.in);
				selectIndex(sc4);
			}
		}
		return position;
	}

}
