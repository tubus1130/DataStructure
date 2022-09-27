package b_sort;

import java.util.Scanner;

public class B_24051 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int[] A = new int[N];
		for(int i=0; i<N; i++) {
			A[i] = sc.nextInt();
		}
		int cnt = 0;
		int temp = -1;
		for(int i=1; i<A.length; i++) {
			int j = i-1;
			int target = A[i];
			while(j >=0 && target <= A[j]) {
				A[j+1] = A[j];
				cnt++;
				if(cnt == K) {
					temp = A[j+1];
				}
				j--;
			}
			if(A[j+1] != target) {
				A[j+1] = target;
				cnt++;
				if(cnt == K) {
					temp = A[j+1];
				}
			}
		}
		System.out.println(temp);
		
		
		sc.close();
	}

}
