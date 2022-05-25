package com.bridgelabz.workshop;

import java.sql.SQLOutput;
import java.util.Scanner;

public class TicTocToe {
    public static char player, computer;

    public static char[] createboard()
    {
        char[] board = new char [10];
        for (int i = 1; i< board.length; i++)
        {
            board[i]=' ';
        }
        return board;
    }
        public void playerchoice(){

            System.out.println("Enter X or O");
            Scanner obj = new Scanner(System.in);
            player = obj.next().charAt(0);

            if (player == 'X' || player == 'x' )
            {
                computer = 'O';
                System.out.println( "Computer " +computer);

            } else if (player == 'O' || player == 'o') {
                computer = 'X';
                System.out.println("Computer " +computer);

            }
        }


    public static void main(String[] args) {
        System.out.println( "Welocme to Tic tac Toe ");
        createboard();
        TicTocToe obj2 = new TicTocToe();
        obj2.playerchoice();
        

        }
}
