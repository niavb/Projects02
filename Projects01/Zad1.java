package recursion;

public class Zad1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub]
		 System.out.println("Sum is " + xMethod(5));
	}

	public static int xMethod(int n) {
		int sum=0;
		for(int i=1; i<=n; i++) {
			sum+=i;
		}
	 return sum;
	}


}
