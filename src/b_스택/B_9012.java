package b_스택;

import java.util.Scanner;
import java.util.Stack;

public class B_9012 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int count = 0;
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<T; i++) {
			Stack<Character> stack = new Stack<>();
			String temp = sc.next();
			char[] tempArr = temp.toCharArray();
			for(int j=0; j<tempArr.length; j++) {
				if(tempArr[j] == '(') {
					stack.push(tempArr[j]);
				}else if(tempArr[j] == ')') {
					if(stack.empty()) {
						sb.append("NO" + '\n');
						count++;
						break;
					}else {
						stack.pop();
					}
				}
			}
			if(stack.empty() && count == i) {
				if(stack.empty()) {
					sb.append("YES" + '\n');
					count++;
				}
			}else if(count == i){
				sb.append("NO" + '\n');
				count++;
			}
		}
		System.out.println(sb);
		sc.close();
	}

}
