package projects14;

public class SortingMethods_CompareTime {
	public static String formatHeader = "%-12s%-10s%-10s%-10s%-10s%n";
	public static String formatTimeData = "%-12d%-10d%-10d%-10d%-10d%n";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.printf(formatHeader, "Array size", "Bubble", "Selection", "Merge", "Quick");
		compareSortingMethods(50000);
		compareSortingMethods(100000);
		compareSortingMethods(150000);
		compareSortingMethods(200000);
		compareSortingMethods(250000);
		compareSortingMethods(300000);

	}
	
	public static void compareSortingMethods(int n) {
		int[] arrB = new int[n];
		int[] arrS = new int[n];
		int[] arrM = new int[n];
		int[] arrQ = new int[n];
		for(int i = 0; i < n; i++) {
			int element = (int) (Math.random() * 1000);
			 arrB[i] = element;
			 arrS[i] = element;
			 arrM[i] = element;
			 arrQ[i] = element;
		}
		
		long timeB = 0, timeS = 0, timeM = 0, timeQ = 0;
		
		long start = System.currentTimeMillis();
		BubbleSort.bubbleSort(arrB);
		timeB = System.currentTimeMillis() - start;
		
		start = System.currentTimeMillis();
		SelectionSort.selectionSort(arrS);
		timeS = System.currentTimeMillis() - start;
		
		start = System.currentTimeMillis();
		MergeSort.mergeSort(arrM);
		timeM = System.currentTimeMillis() - start;
		
		start = System.currentTimeMillis();
		QuickSort.quickSort(arrQ);
		timeQ = System.currentTimeMillis() - start;
		
		System.out.printf(formatTimeData, n, timeB, timeS, timeM, timeQ);
	}

}
