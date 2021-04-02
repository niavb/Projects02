package projects10;

import java.util.*;

import projects07.Zad2;

public class Zad1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Random rn = new Random();

		Map<String, String> hashMapCoun = new HashMap<String, String>();
		loadFromFile(hashMapCoun, "words.txt");

		List<String> countries = new ArrayList<String>(hashMapCoun.keySet());
		int score = 0;

		while (!countries.isEmpty()) {
			String country = countries.get(rn.nextInt(countries.size()));
			countries.remove(country);
			System.out.println("Enter capital of " + country);
			String capital = sc.next();
			if (capital.equals(hashMapCoun.get(country))) {
				System.out.println("Correct");
				score++;
			} else {
				System.out.println("Wrong");
				score--;
			}
		}
		System.out.println("End of game. Score: " + score + "/" + hashMapCoun.size());
		
		
	}
	
	public static void loadFromFile(Map<String, String> map, String fileName) {
		Scanner sc = new Scanner(Zad1.class.getResourceAsStream(fileName));
		while (sc.hasNextLine()) {
			String line = sc.nextLine();
			String[] lineCoun = line.split(",");
			map.put(lineCoun[0], lineCoun[1]);
		}
		sc.close();   
	}

}
