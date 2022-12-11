// p22 연습문제 Q4
package doit.chap01;

import java.util.Scanner;

public class Q4 {
	
	static int med(int a, int b, int c) {
		if(a >= b) {
			if(b >= c) {
				return b;
			}else if(a >= c) {
				return c;
			}else {
				return a;
			}
		}else if(a > c) {
			return a;
		}else if(b > c) {
			return c;
		}else {
			return b;
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("a를 입력해주세요 ");
		int a = sc.nextInt();
		System.out.print("b를 입력해주세요 ");
		int b = sc.nextInt();
		System.out.print("c를 입력해주세요 ");
		int c = sc.nextInt();
		
		System.out.println("중간값은 : " + med(a,b,c));
	}
}
