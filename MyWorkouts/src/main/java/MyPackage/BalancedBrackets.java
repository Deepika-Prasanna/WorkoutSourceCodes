package MyPackage;

import java.util.ArrayDeque;
import java.util.Deque;

public class BalancedBrackets {

	public static boolean areBracketsBalanced(String expr) {
		Deque<Character> stack = new ArrayDeque<>();
		for(int i=0; i<expr.length();i++) {
			char x = expr.charAt(i);
			if(x == '(' || x == '{' || x == '[') {
				stack.push(x);
			}
			if(stack.isEmpty()) {
				return false;
			}
			
			switch(x) {
				case ')': stack.pop();
						  break;
				case '}': stack.pop();
						  break;
				case ']': stack.pop();
						  break;
			}	
		}
		return (stack.isEmpty());
	}
	public static void main(String[] args) {
		String expr = "([{}])";
		if(areBracketsBalanced(expr)) {
			System.out.println("Balanced");
		}else {
			System.out.println("Not Balanced");
		}
	}

}
