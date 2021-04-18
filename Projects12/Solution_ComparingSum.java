package projects12;

public class Solution_ComparingSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] list = {1, 1, 4, 5};
		System.out.println(hasPairWithSum(list, 8));
	}
	
	public static boolean hasPairWithSum(int[] data, int sum) {
		int low = 0;
		int high = data.length - 1;
		while(high>low) {
			if(data[high] + data[low] > sum) {
				high--;
			}else if(data[high] + data[low] < sum) {
				low++;
			}else return true;
		} // T(n) = (n-1)c + T(n-(n-1)) = O(n)
		return false;
	}

}
