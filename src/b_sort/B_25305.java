package b_sort;

import java.util.Arrays;
import java.util.Scanner;

public class B_25305 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int k = sc.nextInt();
		int[] point = new int[N];
		for(int i=0; i<N; i++) {
			point[i] = sc.nextInt();
		}
		Arrays.sort(point);
		System.out.println(point[N-k]);
	}

}
