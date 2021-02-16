package projects04;

public class Zad4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num = {1, 2, 3, 4, 5};
		System.out.println(arithmeticMean(num));

	}
	
	public static double arithmeticMean(int[] num) {
		int last = num.length;
		return arithmeticMean(num, 0, last-1);
	}
	
	public static double arithmeticMean(int[] num, int result, int last) {
		if(last < 0) {
			return (double) result/num.length;
		}
		return arithmeticMean(num, result + num[last], last-1);
	}

}
