package projects11;

import java.util.Scanner;

public class Zad1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string s1: ");
		String[] s1 = sc.nextLine().split("");
		System.out.println("Enter string s2: ");
		String[] s2 = sc.nextLine().split("");
		isMatching(s1, s2);
		
		

	}
	public static void isMatching(String s1[], String s2[]) {
		//s1.length = n
		//s2.length = m
		if (s1.length < s2.length) {
			System.out.println("don't match");
		} else {
			for (int i = 0; i < (s1.length - s2.length + 1); i++) {//T(n) = n-m+1 = O(n-m)
				String word = "";
				String wordInS2 = "";
				for(int j = 0; j < s2.length; j++) {// O(m)
					word += s1[i+j];
					wordInS2 += s2[j];
				}
				if(word.equals(wordInS2) && word != "") {
					System.out.println("Matched at index " + i);
					break;
				}else if(i == (s1.length - s2.length)) {
					System.out.println("don't match");
				}//32-37 => const=c
				//27-37 => T(n) = m + c = O(m)
			}//T(n) = (n-m)*(m) = O(m*n - m^2)
		}
	}//T(n) = m*n - m^2 + c = O(m*n - m^2)

}
