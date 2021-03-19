package projects08;

import java.util.Scanner;
import java.util.Stack;

public class Zad5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a postfix: ");
		Scanner sc = new Scanner(System.in);
		String postfix = sc.nextLine();
		try {
			System.out.println(evaluatePostfix(postfix));
		} catch (Exception ex) {
			System.out.println("Wrong postfix: " + args[0]);
		}

	}
	
	public static int evaluatePostfix(String postfix) {
		Stack<Integer> postfixStack = new Stack<Integer>();
		String[] tokens = postfix.split(" ");
		
		for(String token : tokens) {
			
			if (token.length() == 0) continue;
			
			else if (token.charAt(0) == '+' || token.charAt(0) == '-' || token.charAt(0) == '*' || token.charAt(0) == '/') {
				switch(token.charAt(0)) {
				case '+': processAnOperator(postfixStack, '+'); break;
				case '-': processAnOperator(postfixStack, '-'); break;
				case '*': processAnOperator(postfixStack, '*'); break;
				case '/': processAnOperator(postfixStack, '/'); break;
				}
			}

			else { 
				postfixStack.add(Integer.valueOf(token));
			}
			
		}
		
		return postfixStack.pop();
	}
	
	public static void processAnOperator(Stack<Integer> postfixStack, char op) {
		int num1 = postfixStack.pop();
		int num2 = postfixStack.pop();
		if (op == '+')
			postfixStack.push(num2 + num1);
		else if (op == '-')
			postfixStack.push(num2 - num1);
		else if (op == '*')
			postfixStack.push(num2 * num1);
		else if (op == '/')
			postfixStack.push(num2 / num1);
	}
	

}
