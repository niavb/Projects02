package projects06;

import java.util.ArrayList;
import java.util.Random;

public class Zad2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<>();
		list.add(2);
		list.add(11);
		list.add(7);
		list.add(5);
		shuffle(list);
		System.out.println("Shuffle: " + list);
		sort(list);
		System.out.println("Sort: " + list);
		System.out.println("Min: " + min(list));

	}
	
	public static <E> void shuffle(ArrayList<E> list) {
		int n = list.size();
	    Random random = new Random();
	    for (int i = 0; i < n; i++) {
	      int change = i + random.nextInt(n - i);
	      E helper = list.get(i);
	      list.set(i, list.get(change));
	      list.set(change, helper);
	    }
	}
	
	public static <E extends Comparable<E>> void sort(ArrayList<E> list) {
		E currentMin;
		int currentMinIndex;

		for (int i = 0; i < list.size() - 1; i++) {
			// Find the minimum in the list[i+1..list.length−2]
			currentMin = list.get(i);
			currentMinIndex = i;
			for (int j = i + 1; j < list.size(); j++) {
				if (currentMin.compareTo(list.get(j)) > 0) {
					currentMin = list.get(j);
					currentMinIndex = j;
				}
			}

			// Swap list[i] with list[currentMinIndex] if necessary;
			if (currentMinIndex != i) {
				list.set(currentMinIndex, list.get(i));
				list.set(i, currentMin);
			}
		}
	}
	
	public static <E extends Comparable<E>> E min(ArrayList<E> list) {
		sort(list);
		return list.get(0);
	}


}
