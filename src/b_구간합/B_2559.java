package b_구간합;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class B_2559 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken()); //전체배열
		int K = Integer.parseInt(st.nextToken()); //구간
		
		st = new StringTokenizer(br.readLine());
		
		int result = 0;
		Queue<Integer> queue = new LinkedList<>();
		for(int i=0; i<K; i++) { // 초기윈도우
			int temp = Integer.parseInt(st.nextToken());
			result += temp;
			queue.add(temp);
		}
		int max = result;
		for(int i=0; i<N-K; i++) {
			int temp1 = queue.poll();
			result -= temp1;
			int temp2 = Integer.parseInt(st.nextToken());
			result += temp2;
			queue.add(temp2);
			if(result > max) {
				max = result;
			}
		}
		System.out.println(max);
	}

}
