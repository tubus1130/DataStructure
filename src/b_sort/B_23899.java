package b_sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B_23899 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int[] A = new int[N];
		int[] B = new int[N];
		boolean rate = false;
		getToken(A, new StringTokenizer(br.readLine()));
		getToken(B, new StringTokenizer(br.readLine()));
		if(compare(A, B)) {
			rate = true;
		};
		for(int i=0; i<A.length-1; i++) {
			int max = 0;
			int last = 0;
			for(int j=1; j<A.length-i; j++) {
				if(A[max] < A[j]) {
					max = j;
				}
				last = j;
			}
			if(max != last) {
				int temp = A[max];
				A[max] = A[A.length-1-i];
				A[A.length-1-i] = temp;
			}
			if(compare(A, B)) {
				rate = true;
			};
		}
		if(rate) {
			System.out.println("1");
		}else {
			System.out.println("0");
		}
	}
	
	public static void getToken(int[] arr, StringTokenizer st) {
		int idx = 0;
		while(st.hasMoreTokens()) {
			arr[idx] = Integer.parseInt(st.nextToken());
			idx++;
		}
	}
	
	public static boolean compare(int[] arr1, int[] arr2) {
		for(int i=0; i<arr1.length; i++) {
			if(arr1[i] != arr2[i]) {
				return false;
			}
		}
		return true;
	}

}
