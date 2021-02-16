package projects04;

public class Zad2 {

	public static void main(String[] args) {
		System.out.println("Sum is " + xMethod(5));
		System.out.println("Sum is " + xMethodTailRec(5));
	}

	public static int xMethod(int n) {
		if (n == 1)
			return 1;
		else
			return n + xMethod(n - 1);
	}
	
	public static int xMethodTailRec(int n) {
		return xMethodTailRec(n, 1);
	}
	
	public static int xMethodTailRec(int n, int result) {
		if (n == 1)
			return result;
		else
			return xMethodTailRec(n - 1, result + n);
	}

}
