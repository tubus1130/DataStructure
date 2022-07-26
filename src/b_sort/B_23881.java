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
			int max = A[0];
			int max_num = 0;
			for(int j=1; j<N-i; j++) {
				if(max < A[j]) {
					max = A[j];
					max_num = j;
				}
			}
			if(max_num < N-i-1) {
				int temp = A[max_num];
				A[max_num] = A[N-1-i];
				A[N-1-i] = temp;
				cnt++;
			}
			if(cnt == K) {
				System.out.print(A[max_num] + " " + A[N-1-i]);
			}
		}
		if(cnt < K) {
			System.out.println("-1");
		}
		
		sc.close();
	}
}
