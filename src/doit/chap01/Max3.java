package doit.chap01;

import java.util.Scanner;

public class Max3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("세 정수의 최대값 구하기");
		System.out.print("a의 값 : ");
		int a = sc.nextInt();
		System.out.print("b의 값 : ");
		int b = sc.nextInt();
		System.out.print("c의 값 : ");
		int c = sc.nextInt();
		
		int max = a;
		if(b > max) {
			max = b;
		}
		if(c > max) {
			max = c;
		}
		System.out.println("최댓값은 : " + max);
	}
}
