package projects02;

public class Zad2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(dec2Bin(234));

	}
	
	public static String dec2Bin(int value) {
		if(value==1) {
			return "1";
		}else {
			return dec2Bin(value/2) + value%2;
		}
	}

}
