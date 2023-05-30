package com.company;
import java.util.Random;
import java.util.Scanner;


public class CWH_RockPaperScissor {
    public static void main(String[] args) {
        Random rd=new Random();
        int computer=rd.nextInt(4);
        System.out.println("Choose 1 for Rock");
        System.out.println("Choose 2 for Paper");
        System.out.println("Choose 3 for Scissor");

        int round=0;
        int won=0;
        int lost=0;
        int draw=0;

        while(round<3) {
            System.out.println("Enter your choice: ");
            Scanner sc = new Scanner(System.in);
            int you = sc.nextInt();

            switch (you) {
                case 1 -> System.out.println("You chose Rock");
                case 2 -> System.out.println("You chose Paper");
                case 3 -> System.out.println("You chose Scissor");
            }
            switch (computer) {
                case 1 -> System.out.println("Computer chose Rock");
                case 2 -> System.out.println("Computer chose Paper");
                case 3 -> System.out.println("Computer chose Scissor");
            }

            if (you == 1 && computer == 3) {
                System.out.println("You Won!");
                won = won + 1;
            } else if (you == 2 && computer == 1) {
                System.out.println("You Won!");
                won = won + 1;
            } else if (you == 3 && computer == 2) {
                System.out.println("You Won!");
                won = won + 1;
            } else if (you == computer) {
                System.out.println("It's Draw!");
                draw=draw+1;
            } else {
                System.out.println("You Fail!");
                lost=lost+1;
            }
            round=round+1;
        }
        if(won>1 || (won==1 && draw==2))
        {
            System.out.println("Congratulations! You won the game");
        }
        else if(lost>1 || (lost==1 && draw==2))
        {
            System.out.println("You lost the game, try again!");
        }
        else if (won==lost)
        {
            System.out.println("The match is draw, try again!");
        }
    }
}
