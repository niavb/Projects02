package projects09;

import java.io.*;
import java.util.*;

public class Zad1 {

	public static void main(String[] args) throws Exception {
		File file = new File("src/projects07/Ball.java");
		if (file.exists()) {
			System.out.println("The number of vowels is " + countVowels(file));
		} else {
			System.out.println("File does not exist");
		}

	}

	public static int countVowels(File file) throws Exception {
		String[] vowelString = {"a","e","i","o","u"};
		Set<String> vowelSet = new HashSet<String>(Arrays.asList(vowelString));
		int count = 0;

		Scanner input = new Scanner(file);
		while (input.hasNext()) {
			String word = input.next();
			String[] letters = word.split("");
			for (String letter : letters) if (vowelSet.contains(letter)) count++;
		}
		return count;
	}

}
