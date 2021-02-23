package test01;

public class Recursiq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] list = {2, 4, 7, 1, 9};
		System.out.println(findMin(list));

	}
	
	public static int findMin(int[] list) {
		int last = list.length;
		return findMin(list, list[last-1], last-1);

	}

	public static int findMin(int[] list, int min, int last) {
		if(last < 0) {
			return min;
		}else if(min>list[last]) {
		    return findMin(list, list[last], last-1);
		}else {
			return findMin(list, min, last-1);
		}

	}

}
