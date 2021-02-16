package projects02;

public class Zad1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(odd(23));
		System.out.println(even(22));

	}
	
	public static boolean odd(int x) {
		if(x==1) {
			return true;
		}else if(x==0) {
			return false;
		}else {
			return odd(x-2);
		}
	}
	
	public static boolean even(int x) {
		if(x==1) {
			return false;
		}else if(x==0) {
			return true;
		}else {
			return even(x-2);
		}
	}

}
