package com.bridgelabz.workshop;

import java.sql.SQLOutput;

public class TicTocToe {
    public static char[] createboard()
    {
        char[] board = new char [10];
        for (int i = 1; i< board.length; i++)
        {
            board[i]=' ';
        }
        return board;
    }


    public static void main(String[] args) {
        System.out.println( "Welocme to Tic tac Toe ");
        createboard();
    }
}
