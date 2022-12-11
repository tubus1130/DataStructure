// p31 Q7
// for문 가우스덧셈
package doit.chap01;

import java.util.Scanner;

public class Q7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("n값을 입력해주세요 : ");
		int n = sc.nextInt();
		
		int sum = (1 + n) * n/2;
		
		System.out.println("n까지의 합은 : " + sum);
	}
}