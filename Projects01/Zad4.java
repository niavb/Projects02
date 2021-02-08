package recursion;

import java.util.Scanner;

public class Zad4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter x: ");
		double x = sc.nextInt();
		System.out.println(methodRecursion(3,x));
		System.out.println(methodInteration(3,x));
		sc.close();

	}
	
	public static double methodRecursion(int n, double x) {
		if (n == 0) {
			return 1;
		} else {
			return x * methodRecursion(n - 1, x);
		}
	}

	public static double methodInteration(int n, double x) {
		double sum = 1;
		for (int i = 0; i < n; i++) {
			sum *= x;
		}
		return sum;
	}

}
