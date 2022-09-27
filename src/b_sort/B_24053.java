package b_sort;

import java.util.Scanner;

public class B_24053 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] A = new int[N];
		int[] B = new int[N];
		for(int i=0; i<N; i++) {
			A[i] = sc.nextInt();
		}
		for(int i=0; i<N; i++) {
			B[i] = sc.nextInt();
		}
		if(compare(A, B)) {
			System.out.println("1");
			return;
		};
		for(int i=1; i<A.length; i++) {
			int j = i-1;
			int target = A[i];
			while(j >=0 && target <= A[j]) {
				A[j+1] = A[j];
				j--;
				if(compare(A, B)) {
					System.out.println("1");
					return;
				};
			}
			if(A[j+1] != target) {
				A[j+1] = target;
				if(compare(A, B)) {
					System.out.println("1");
					return;
				};
			}
		}
		System.out.println("0");
		
		sc.close();
	}
	public static boolean compare(int[] A, int[] B) {
		for(int i=0; i<A.length; i++) {
			if(A[i] != B[i]) {
				return false;
			}
		}
		return true;
	}

}
