package boj_04_sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_19_11004 {
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
		quickSort(A, 0, N-1);
		System.out.println(A[K-1]);
	}
	public static void quickSort(int[] A, int left, int right) {
		if(left >= right) {
			return;
		}
		
		int pivot = A[(left+right)/2];
		int i = left;
		int j = right;
		while(i <= j) {
			while(A[i] < pivot) {
				i++;
			}
			while(A[j] > pivot) {
				j--;
			}
			if(i <= j) {
				swap(A, i, j);
				i++;
				j--;
			}
		}
		quickSort(A, left, j);
		quickSort(A, i, right);
		
	}
	public static void swap(int[] A, int i, int j) {
		int temp = A[i];
		A[i] = A[j];
		A[j] = temp;
	}
}
