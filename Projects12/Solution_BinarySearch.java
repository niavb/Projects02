package projects12;

public class Solution_BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] list = {1, 2, 4, 4};
		System.out.println(hasPairWithSum(list, 8));

	}
	
	public static boolean hasPairWithSum(int[] data, int sum) {
		for(int i = 0; i < data.length; i++) {
			int index = binarySearch(data, 8-data[i]);
			if(index!=-1 && index!=i) {
				return true;
			}
		}
		return false;
	}
	
	public static int binarySearch(int[] list, int key) {
		int low = 0;
		int high = list.length - 1;
		while(high >= low) {
			int mid = (low + high) / 2;
			if(key < list[mid]) {
				high = mid - 1;
			}else if (key == list[mid]) {
				return mid;
			}else low = mid + 1;
		}
		return -1;
	}

}
