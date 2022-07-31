package boj_03_datastructure;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_05_10986 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		long[] A = new long[N+1];
		st = new StringTokenizer(br.readLine());
		for(int i=1; i<A.length; i++) {
			A[i] = Integer.parseInt(st.nextToken());
		}
		long[][] D = new long[N+1][N+1];
		for(int i=1; i<N+1; i++) {
			for(int j=i; j<N+1; j++) {
				for(int k=i; k<=j; k++) {
					D[i][j] += A[k];
				}
			}
		}
		int result = 0;
		for(int i=0; i<N+1; i++) {
			for(int j=0; j<N+1; j++) {
				long num = D[i][j];
				if(num != 0 && num%3 == 0) {
					result+=1;
				}
			}
		}
		System.out.println(result);
		
	}

}
