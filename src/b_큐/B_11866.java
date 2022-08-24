package b_큐;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class B_11866 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		StringBuilder sb = new StringBuilder();
		sb.append("<");
		Queue<Integer> queue = new LinkedList<>();
		for(int i=1; i<=N; i++) {
			queue.add(i);
		}
		
		while(queue.size() > 0) {
			for(int i=0; i<K-1; i++) {
				int temp = queue.poll();
				queue.add(temp);
			}
			sb.append(queue.poll());
			if(queue.size() > 0) {
				sb.append(", ");
			}else {
				sb.append(">");
			}
		}
		System.out.println(sb);
	}
}
