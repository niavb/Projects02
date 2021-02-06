package recursion;

public class Zad3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(methodRecursion(3));
		System.out.println(methodInteration(3));

	}

	public static int methodRecursion(int n) {
		if (n == 0) {
			return 1;
		} else if (n == 1) {
			return 2;
		} else {
			return 2 * methodRecursion(n - 1);
		}
	}

	public static int methodInteration(int n) {
		int sum = 1;
		for (int i = 0; i < n; i++) {
			sum *= 2;
		}
		return sum;
	}

}
