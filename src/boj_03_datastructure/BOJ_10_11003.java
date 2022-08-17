package boj_03_datastructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_10_11003 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken()); // 총 배열크기
		int L = Integer.parseInt(st.nextToken()); // 윈도우크기
		st = new StringTokenizer(br.readLine());
		int[] A = new int[N]; // 총 배열
		int[] window = new int[L]; // 윈도우배열
		int[] result = new int[N]; // 결과배열
		for(int i=0; i<N; i++) {
			A[i] =  Integer.parseInt(st.nextToken());
		}
		int i = 1;
		for(int j=0; j<L; j++) {
			if(i-L+1 < 1) {
				window[j] = 0;
			}else {
				
			}
		}
		
		
	}
}
