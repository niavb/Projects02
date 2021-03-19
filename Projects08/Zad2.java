package projects08;

import java.util.Scanner;
import java.util.Stack;

public class Zad2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter an expression: ");
		Scanner sc = new Scanner(System.in);
		String expression = sc.nextLine();
		try {
			System.out.println(checkBrackets(expression));
		} catch (Exception ex) {
			System.out.println("Wrong expression: " + args[0]);
		}

	}
	
	public static boolean checkBrackets(String expression) {
		Stack<Character> bracketsStack = new Stack<Character>();
		boolean isTrue = true;
		
		expression = insertBlanks(expression);
		String[] brackets = expression.split(" ");
		
		for (String bracket : brackets) {
			
			if (bracket.length() == 0) // Blank space
				continue;
			
			else if(bracket.charAt(0) == '(' || bracket.charAt(0) == '{' || bracket.charAt(0) == '[') 
				bracketsStack.push(bracket.charAt(0));
			
			else if(bracket.charAt(0) == ')' || bracket.charAt(0) == '}' || bracket.charAt(0) == ']') {
				char lastBracket = bracketsStack.pop();
				
				switch(bracket.charAt(0)) {
				case ')':	if(lastBracket == '{' || lastBracket == '[') {isTrue = false;} break;
				case '}':	if(lastBracket == '(' || lastBracket == '[') {isTrue = false;} break;
				case ']':   if(lastBracket == '(' || lastBracket == '{') {isTrue = false;} break;
				}
			}
			
			else continue;
			
		}
		return isTrue;
		
	}
	
	public static String insertBlanks(String s) {
		String result = "";
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '(' ||s.charAt(i) == ')' || s.charAt(i) == '{' || s.charAt(i) == '}' || s.charAt(i) == '[' || s.charAt(i) == ']') {
				result += " " + s.charAt(i) + " ";
			}
			else
				result += s.charAt(i);
		}
		return result;
	}

}
