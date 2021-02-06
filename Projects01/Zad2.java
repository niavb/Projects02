package recursion;

public class Zad2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		xMethod(1234567);
	}

	public static void xMethod(int n) {
		while (n > 0) {
			System.out.print(n % 10);
			n = n / 10;
		}
	}

}
