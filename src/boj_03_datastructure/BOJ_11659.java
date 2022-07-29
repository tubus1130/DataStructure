package boj_03_datastructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class BOJ_11659 {

	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int suNo = Integer.parseInt(st.nextToken());
		int quizNo = Integer.parseInt(st.nextToken());
		
		long[] S = new long[suNo + 1];
		st = new StringTokenizer(br.readLine());
		for(int i=1; i<=suNo; i++) {
			S[i] = S[i-1] + Integer.parseInt(st.nextToken());
		}
		for(int q=0; q<quizNo; q++) {
			st = new StringTokenizer(br.readLine());
			int i = Integer.parseInt(st.nextToken());
			int j = Integer.parseInt(st.nextToken());
			System.out.println(S[j] - S[i-1]);
		}
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int N = sc.nextInt();
//		int M = sc.nextInt();
//		
//		int[] totalArray = new int[N];
//		int[] result = new int[M];
//		int temp = 0;
//		for(int idx=0; idx<N; idx++) {
//			temp += sc.nextInt();
//			totalArray[idx] = temp;
//		}
//		
//		for(int idx=0; idx<M; idx++) {
//			int i = sc.nextInt();
//			int j = sc.nextInt();
//			if(i == 1) {
//				result[idx] = totalArray[j-1];
//			}else {
//				result[idx] = totalArray[j-1] - totalArray[i-2];
//			}
//		}
//		
//		for(int idx=0; idx<result.length; idx++) {
//			System.out.println(result[idx]);
//		}
//	}
	}

}
