package com.TicTacToe;
import java.util.*;
import java.lang.*;

public class TicTacToeGame {

	public static void main(String[] args) {
	   char[] board;
	   board = createBoard();

	}
	
	
	
	private static char[] createBoard()
	{
		char[] board1 = new char[10];
		for(int i=0;i<board1.length;i++)
		{
			board1[i]=' ';
		}
		return board1;
	}

}









// UC1 : To create a 