package projects02;

import java.util.Scanner;

public class Zad3 {
	
	public static int sum = 0;

	public static void main(String[] args) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);
		System.out.print("Enter number of disks: ");
		int n = input.nextInt();
		// Find the solution recursively
		System.out.println("The moves are:");
		moveDisks(n, 'A', 'B', 'C');
		System.out.println(sum);
		input.close();
	}

	/**
	 * The method for finding the solution to move n disks from fromTower to toTower
	 * with auxTower
	 */
	public static void moveDisks(int n, char fromTower, char toTower, char auxTower) {
		if (n == 1) {
			System.out.println("Move disk " + n + " from "+ fromTower + " to " + toTower);
			sum++;
		}
		
		else {
			moveDisks(n - 1, fromTower, auxTower, toTower);
			System.out.println("Move disk " + n + " from " + fromTower + " to " + toTower);
			sum++;
			moveDisks(n - 1, auxTower, toTower, fromTower);
		}
	}
}


