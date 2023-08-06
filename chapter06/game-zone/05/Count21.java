/*
Farrel Joyce - Java Programming, 10th Edition (2023)

Chapter 06, Game Zone 5

Task:
Two people play the game of Count 21 by taking turns entering a 1, 2, or 3,
which is added to a running total. The player who adds the value that makes
the total reach or exceed 21 loses the game. Create a game of Count 21 in
which a player competes against the computer, and program a strategy that
always allows the computer to win. On any turn, if the player enters a value
other than 1, 2, or 3, force the player to reenter the value.
Savethe game as Count21.java.

Written by: Jakov Milas
https://github.com/JakovMilas/java-farell-joyce-10th-edition
*/


import java.util.Scanner;

public class Count21 {

    public static void main(String[] args) {
        playCount21();

    }

    public static void playCount21() {
        int total = 0;
        int playerChoice;
        int computerChoice;

        System.out.println("Welcome to Count 21!");
        System.out.println("You are playing against the computer.");
        System.out.println("The player who makes the total reach or exceed 21 loses.");

        while (total < 21) {
            System.out.println("Current Total: " + total);

            playerChoice = getPlayerChoice();
            total += playerChoice;
            if (total >= 21) {
                System.out.println("You lose! The computer wins!");
                break;
            }

            computerChoice = getComputerChoice(total);
            total += computerChoice;
            System.out.println("Computer chooses: " + computerChoice);
            if (total >= 21) {
                System.out.println("Congratulations! You win!");
                break;
            }
        }

        System.out.println("Game Over.");
    }

    public static int getPlayerChoice() {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.print("Enter 1, 2, or 3: ");
            choice = scanner.nextInt();
        } while (choice < 1 || choice > 3);

        return choice;
    }

    public static int getComputerChoice(int currentTotal) {
        int remainder = currentTotal % 4;
        if (remainder == 0) {
            return 1;
        } else {
            return 4 - remainder;
        }
    }
}

