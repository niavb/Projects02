package projects14;

import projects06.Circle;

public class MergeSort_Comparable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle[] list = { new Circle("2", false, 2), new Circle("3", false, 3), new Circle("5", false, 5),
				new Circle("1", false, 1), new Circle("14", false, 14), new Circle("6", false, 6) };
		mergeSort(list);
		for (int i = 0; i < list.length; i++)
			System.out.print(list[i] + " ");

	}

	public static <E extends Comparable<E>> void mergeSort(E[] list) {
		if (list.length > 1) {
			// Merge sort the first half
			E[] firstHalf = (E[]) new Comparable[list.length / 2];
			System.arraycopy(list, 0, firstHalf, 0, list.length / 2);
			mergeSort(firstHalf);
			// Merge sort the second half
			int secondHalfLength = list.length - list.length / 2;
			E[] secondHalf = (E[]) new Comparable[secondHalfLength];
			System.arraycopy(list, list.length / 2, secondHalf, 0, secondHalfLength);
			mergeSort(secondHalf);
			// Merge firstHalf with secondHalf into list
			merge(firstHalf, secondHalf, list);
		}
	}

	/** Merge two sorted lists */
	public static <E extends Comparable<E>> void merge(E[] list1, E[] list2, E[] temp) {
		int current1 = 0;
		int current2 = 0;
		int current3 = 0;

		while (current1 < list1.length && current2 < list2.length) {
			if (list1[current1].compareTo(list2[current2]) < 0)
				temp[current3++] = list1[current1++];
			else
				temp[current3++] = list2[current2++];
		}
		while (current1 < list1.length)
			temp[current3++] = list1[current1++];
		while (current2 < list2.length)
			temp[current3++] = list2[current2++];
	}

}
