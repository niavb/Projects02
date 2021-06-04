package project02;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class HabitTracker {
	public int[][] table;

	public HabitTracker(String filePath, int habitsRow) throws FileNotFoundException {

		Scanner in = new Scanner(new File(filePath));
		this.table = new int[habitsRow][];

		for (int i = 0; i < habitsRow; i++) {
			String line = in.nextLine();
			String[] numbers = line.split(", ");
			this.table[i] = new int[7];
			for (int j = 0; j < 7; j++) {
				this.table[i][j] = Integer.parseInt(numbers[j]);
			}
		}

		
	}

}