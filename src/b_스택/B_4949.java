package b_스택;

import java.io.IOException;
import java.util.Scanner;
import java.util.Stack;

public class B_4949 {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		String temp;
		while(true) {
			temp = sc.nextLine();
			if(temp.equals(".")) {
				break;
			}
			System.out.println(search(temp));
		}
	}

	private static String search(String temp) {
		Stack<Character> stack = new Stack<>();
		for(int i=0; i<temp.length(); i++) {
			char c = temp.charAt(i);
			
			if(c == '(' || c == '[') {
				stack.push(c);
			}else if(c == ')') {
				if(stack.empty() || stack.peek() != '(') {
					return "no";
				}else {
					stack.pop();
				}
			}else if(c == ']') {
				if(stack.empty() || stack.peek() != '[') {
					return "no";
				}else {
					stack.pop();
				}
			}
		}
		if(stack.empty()) {
			return "yes";
		}else {
			return "no";
		}
	}
}
