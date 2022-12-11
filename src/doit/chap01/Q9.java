// p35 Q9
// while문
package doit.chap01;

import java.util.Scanner;

public class Q9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("a값 : ");
		int a = sc.nextInt();
		int b;
		while(true) {
			System.out.print("b값 : ");
			b = sc.nextInt();
			if(a >= b) {
				System.out.println("a보다 큰 값을 입력하세요!");
			}else {
				break;
			}
		}
		System.out.println("b - a는 " + (b - a) + "입니다.");
	}
}
