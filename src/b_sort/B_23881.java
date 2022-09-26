package b_sort;

import java.util.Scanner;

public class B_23881 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int[] A = new int[N];
		
		for(int i=0; i<N; i++) {
			A[i] = sc.nextInt();
		}
		int cnt = 0;
		for(int i=0; i<N-1; i++) {
			int max = 0;
			for(int j=0; j<N-1-i; j++) {
				if(A[max] < A[j]) {
					max = j;
				}
			}
			
			int temp = A[max];
			A[max] = A[N-1-i];
			A[N-1-i] = temp;
			cnt++;
		}
	}
}
