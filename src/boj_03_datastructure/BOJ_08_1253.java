package boj_03_datastructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ_08_1253 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		long[] A = new long[N];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0; i<A.length; i++) {
			A[i] = Long.parseLong(st.nextToken());
		}
		Arrays.sort(A);
		
		
		int count = 0;
		
		for(int i=0; i<N; i++) {
			int min = 0;
			int max = N-1;
			while(min < max) {
				if(A[min] + A[max] > A[i]) {
					max--;
				}else if(A[min] + A[max] < A[i]) {
					min++;
				}else {
					if(min != i && max != i) {
						count++;
						break;
					}else if(min == i) {
						min++;
					}else {
						max--;
					}
				}
			}
		}
		System.out.println(count);
		br.close();
	}
}
