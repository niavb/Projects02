package projects11;

import java.util.Scanner;

public class Zad2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string: ");
		String[] arr = sc.nextLine().split("");
		System.out.print(arr[0]);
		for(int i = 0; i<arr.length; i++) {//O(n)
			for(int j = i + 1; j<arr.length; j++) {//O(n-1)
				if(arr[i].compareTo(arr[j])<=0) {
					System.out.print(arr[j]);
					i=j-1;
					break;
				}else if(j==arr.length-1) {
					i = arr.length-1;
				}// const = c
			}//T(n) = c*(n-1) = O(n)
		}
		// T(n) = n*n = O(n^2)

	}

}
