package ndb_greedy;

import java.util.Arrays;
import java.util.Scanner;

public class greedy02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int k = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		Arrays.sort(arr);
		// 2 4 4 5 6
		int sum = 0;
		int cnt = 0;
		for(int i=0; i<m; i++) {
			if(cnt != k) {
				sum += arr[arr.length-1];
				cnt++;
			}else {
				sum += arr[arr.length-2];
				cnt = 0;
			}
		}
		System.out.println(sum);
	}
}
