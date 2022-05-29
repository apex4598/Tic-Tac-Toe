package com.bridgelabz.workshop;

import java.util.Scanner;

public class TicTocToe {
    private static char[] board = new char[10];
    public static char player, computer;

    public void createboard()
    {

        for (int i = 1; i< board.length; i++)
        {
            board[i]=' ';
        }

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
    public void displayBoard(char[] board){

            System.out.println(+ board[1] + "|" + board[2] +"|" + board[3]);

            System.out.println("---");
            System.out.println(+ board[3] + "|" + board[4] +"|" + board[5]);

            System.out.println("---");
            System.out.println(+ board[7] + "|" + board[8] + "|" + board[9]);

            System.out.println("---");
    }
    public void move(char[] board) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter Input :");
        int i = obj.nextInt();
        if (0 < i && i < 10) {
            if (board[i] == ' ') {
                board[i] = player;
            } else {
                System.out.println("Occupied Already");
            }
        }
    }
        public static void main(String[] args) {
        System.out.println( "Welocme to Tic tac Toe ");
        //createboard();
        TicTocToe obj2 = new TicTocToe();
        obj2.createboard();
        obj2.playerchoice();
        obj2.displayBoard(board);
        obj2.move(board);

        }
}
