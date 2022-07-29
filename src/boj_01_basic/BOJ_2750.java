package boj_01_basic;

import java.util.LinkedList;
import java.util.Scanner;

public class BOJ_2750 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int total = sc.nextInt();
		int temp = 0;
		LinkedList<Integer> list = new LinkedList<>();
		for(int i=0; i<total; i++) {
			list.add(sc.nextInt());
		}
		for(int i= -1000; i<=1000; i++) {
			if(list.contains(i)) {
				System.out.println(i);
			}
		}
	}
}