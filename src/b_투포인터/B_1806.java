package b_투포인터;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B_1806 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int S = Integer.parseInt(st.nextToken());
		int[] arr = new int[N+1];
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		int len = Integer.MAX_VALUE;
		int start = 0;
		int end = 0;
		int total = 0;
		while(start <= end && end <= N) {
			if(total < S) {
				total += arr[end];
				end++;
			}else {
				if(len > end-start) {
					len = end-start;
				}
				total -= arr[start];
				start++;
			}
		}
		if(len == Integer.MAX_VALUE) {
			System.out.println(0);
		}else {
			System.out.println(len);
		}
	}
}
