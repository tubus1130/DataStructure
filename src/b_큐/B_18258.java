package b_큐;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class B_18258 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		Queue<Integer> queue = new LinkedList<Integer>();
		StringBuilder sb = new StringBuilder();
		int backNum = 0;
		
		for(int i=0; i<N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String command = st.nextToken();
			switch(command) {
			case "push":
				int num = Integer.parseInt(st.nextToken());
				queue.add(num);
				backNum = num;
				break;
			case "pop":
				if(!queue.isEmpty()) {
					sb.append(queue.poll() + "\n");
				}else {
					sb.append(-1 + "\n");
				}
				break;
			case "size":
				sb.append(queue.size() + "\n");
				break;
			case "empty":
				if(queue.isEmpty()) {
					sb.append(1 + "\n");
				}else {
					sb.append(0 + "\n");
				}
				break;
			case "front":
				if(queue.isEmpty()) {
					sb.append(-1 + "\n");
				}else {
					sb.append(queue.peek() + "\n");
				}
				break;
			case "back":
				if(queue.isEmpty()) {
					sb.append(-1 + "\n");
				}else {
					sb.append(backNum + "\n");
				}
				break;
			}
		}
		System.out.println(sb);
	}

}
