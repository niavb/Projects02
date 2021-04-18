package projects12;

import java.util.*;

public class Solution_HashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] list = {1, 4, 4, 5};
		System.out.println(hasPairWithSum(list, 8));

	}
	
	public static boolean hasPairWithSum(int[] data, int sum) {
		Set<Integer> comp = new HashSet<Integer>();
		for(int value : data) {
			if(comp.contains(value)) {
				return true;
			}else {
				comp.add(sum-value);
			}
		}
		return false;
	}

}
