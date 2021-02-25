package projects05;

import java.util.Scanner;

public class TestGenericStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		GenericStack<String> stack = new GenericStack<>();
		System.out.println("Enter: ");
		for(int i = 0; i < 5; i++) {
			stack.push(sc.nextLine());
		}
		for(int i = 0; i < 5; i++) {
			System.out.println(stack.pop());
		}
		
		sc.close();

	}

}
