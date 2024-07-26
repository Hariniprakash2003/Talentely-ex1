package main1;

import java.util.*;

public class main1 {

	public static void main(String[] args) {

		String inp = input();
		System.out.println(infixToPostfix(removeAlphabet(inp), getOperator(inp)));
	}

	static int infixToPostfix(String a, String s) {
		Stack<Integer> stack = new Stack<Integer>();

		for (int i = a.length() - 1; i >= 0; i--) {
			stack.add(Integer.parseInt(Character.toString(a.charAt(i))));
		}

		for (int i = 0; i < s.length(); i++) {
			switch (s.charAt(i)) {
			case '+': {
				stack.push(stack.pop() + stack.pop());
				break;
			}

			case '-': {
				int x = stack.pop();
				int y = stack.pop();
				stack.push(Math.max(x, y) - Math.min(x, y));
				break;
			}

			case '*': {
				stack.push(stack.pop() * stack.pop());
				break;
			}
			case '/': {
				int x = stack.pop();
				int y = stack.pop();
				stack.push(Math.max(x, y) / Math.min(x, y));
				break;
			}
			}
		}
		return stack.pop();
	}
	static String input() {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the Pattern :");
		return in.nextLine();
	}

	static String removeAlphabet(String s) {
		String r = "";
		for (int i = 0; i < s.length(); i++) {
			if ((int) (s.charAt(i)) > 47 && (int) (s.charAt(i)) <= 57) {
				r += s.charAt(i);
			}
		}
		return r;
	}
	static String getOperator(String s) {
		return s.replaceAll("[A-Za-z0-9]", "");
	}

}
