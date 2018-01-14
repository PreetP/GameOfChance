package cs1;

import java.util.Random;
import java.util.*;

public class GameOfChance {
	public static void main(String[] args) {
		int balance = 0;
		int bet;
		int start;
		int round = 0;
		int newroll;
		int x = 0;

		Scanner scanner = new Scanner(System.in);
		System.out.println("Welcome to the GAME OF CHANCE program");
		System.out.println("Do you want to play? Enter 1 to start, or 2 to quit");
		start = scanner.nextInt();
		if (start == 1) {
			do {
				System.out.println("\n Please enter a number to set a balance");
				balance = scanner.nextInt();
				System.out.println("Please enter a bet number");
				bet = scanner.nextInt();
			} while (balance < 0 || bet < 0);
			do {
				int dice1 = (int) (Math.random() * 6 + 1);
				int dice2 = (int) (Math.random() * 6 + 1);
				int roll = dice1 + dice2;
				System.out.println("You rolled: " + (dice1 + dice2));
				if (roll == 2 || roll == 3 || roll == 12) {
					System.out.println("You LOSE :( ");
					balance = bet - 1;
					break;
				}
				if (roll == 7 || roll == 11) {
					System.out.println("You WIN!");
					balance = bet + 1;
					break;
				}
			} while (balance > 0);
		} else {
			System.out.println("Thank you for playing, your final balance was: " + balance);
		}
	}
}
