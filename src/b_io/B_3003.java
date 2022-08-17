package b_io;

import java.util.Scanner;

public class B_3003 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] input = new int[6];
		int[] chess = {1, 1, 2, 2, 2, 8};
		for(int i=0; i<input.length; i++) {
			input[i] = chess[i] - sc.nextInt();
		}
		for(int i=0; i<input.length; i++) {
			System.out.print(input[i] + " ");
		}
		sc.close();
	}
}
