package projects04;

public class Zad3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(powRecursive(2, 3));
		System.out.println(powRecursiveTailRec(2, 3));

	}
	
	public static int powRecursive(int x, int n) {
		if (n == 0) {
			return 1;
		}
		return x * powRecursive(x, n - 1);
	}
	
	public static int powRecursiveTailRec(int x, int n) {
		return powRecursiveTailRec(x, n, 1);
	}
	
	public static int powRecursiveTailRec(int x, int n, int result) {
		if (n == 0) {
			return result;
		}
		return powRecursiveTailRec(x, n - 1, result*x);
	}

}
