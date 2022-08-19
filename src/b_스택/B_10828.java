package b_스택;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class B_10828 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st;
		Stack<Integer> stack = new Stack<>();
		StringBuffer sb = new StringBuffer();
		for(int i=0; i<N; i++) {
			st = new StringTokenizer(br.readLine());
			String command = st.nextToken();
			switch(command) {
			case "push":
				stack.push(Integer.parseInt(st.nextToken()));
				break;
			case "pop":
				if(stack.empty()) {
					sb.append(-1 + "\n");
				}else {
					sb.append(stack.pop() + "\n");
				}
				break;
			case "size":
				sb.append(stack.size() + "\n");
				break;
			case "empty":
				if(stack.empty()) {
					sb.append(1 + "\n");
				}else {
					sb.append(0 + "\n");
				}
				break;
			case "top":
				if(stack.empty()) {
					sb.append(-1 + "\n");
				}else {
					sb.append(stack.peek() + "\n");
				}
				break;
			}
		}
		System.out.println(sb);
	}

}
