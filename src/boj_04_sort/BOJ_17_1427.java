package boj_04_sort;

import java.util.Scanner;

public class BOJ_17_1427 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] arr2 = sc.next().toCharArray();
		int[] arr = new int[arr2.length];
		for(int i=0; i<arr.length; i++) {
			arr[i] = arr2[i] - 48;
		}
		
		for(int i=0; i<arr.length; i++) {
			int max = arr[i];
			int target = 0;
			for(int j=i; j<arr.length; j++) {
				if(arr[j] > max) {
					max = arr[j];
					target = j;
				}
			}
			int temp = 0;
			temp = arr[i];
			arr[i] = max;
			if(target != 0) {
				arr[target] = temp;
			}
		}
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]);
		}
	}

}
