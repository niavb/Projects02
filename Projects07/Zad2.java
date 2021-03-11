package projects07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Zad2 {
	
	public static void main(String[] args) {

		ArrayList <String> list = new  ArrayList<>();
		loadFromFile(list, "words.txt");
		Collections.sort(list);
		System.out.println(list);
		 
	}

	public static void loadFromFile(ArrayList <String> list, String fileName) {
		Scanner sc = new Scanner(Zad2.class.getResourceAsStream(fileName));
		while (sc.hasNextLine()) {
				String data = sc.next();
				list.add(data);
		}
		sc.close();
	   
	}

}
