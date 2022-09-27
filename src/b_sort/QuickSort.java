package b_sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class QuickSort {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		int[] A = new int[N];
		for(int i=0; i<N; i++) {
			A[i] = Integer.parseInt(st.nextToken());
		}
		
		sort(A, 0, A.length-1);
		System.out.println(A[K-1]);
	}
	
	public static void sort(int[] A, int first, int last) {
		if(first >= last) {
			return;
		}
		int pivot = first;
		int i = first + 1;
		int j = last;
		
		while(i <= j) {
			while(i <= last && A[i] <= A[pivot]) {
				i++;
			}
			while(j > first && A[j] >= A[pivot]) {
				j--;
			}
			if(i > j) {
				swap(A, pivot, j);
			}else {
				swap(A, i, j);
			}
		}
		sort(A, first, j-1);
		sort(A, j+1, last);
	}
	
	public static void swap(int[] A, int i, int j) {
		int temp = A[i];
		A[i] = A[j];
		A[j] = temp;
	}

}
