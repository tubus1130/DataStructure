package boj_03_datastructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ_07_1940 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int M = Integer.parseInt(br.readLine());
		int[] ar = new int[N];
		int num = 0;
		StringTokenizer st = new StringTokenizer(br.readLine());
		while(st.hasMoreTokens()) {
			ar[num++] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(ar);
		
		int count = 0;
		int i = 0;
		int j = N-1;
		int sum = 0;
		while(i < j) {
			sum = ar[i] + ar[j];
			if(sum < M) {
				i++;
			}else if(sum > M) {
				j--;
			}else {
				count++;
				i++;
			}
		}
		System.out.println(count);
		br.close();
	}
}
