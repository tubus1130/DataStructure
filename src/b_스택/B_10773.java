package b_스택;

import java.util.Scanner;
import java.util.Stack;

public class B_10773 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int K = sc.nextInt();
		long result = 0;
		Stack<Integer> stack = new Stack<>();
		for(int i=0; i<K; i++) {
			int temp = sc.nextInt();
			if(temp == 0) {
				result -= stack.pop();
			}else {
				stack.push(temp);
				result += temp;
			}
		}
		System.out.println(result);
		sc.close();
	}

}
