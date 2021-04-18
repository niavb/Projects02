package projects12;

public class Solution_Loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] list = {1, 4, 4, 9};
		System.out.println(hasPairWithSum(list, 8));

	}
	
	public static boolean hasPairWithSum(int[] data, int sum) {
		for(int i = 0; i < data.length; i++) {
			for(int j = i + 1; j < data.length; j++) {
				if(data[i] + data[j] == 8) {
					return true;
				}
			}
		}
		return false;
	}

}
