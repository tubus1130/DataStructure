// p30 Q6
// while문
package doit.chap01;

import java.util.Scanner;

public class Q6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("n값을 입력해주세요 : ");
		int n = sc.nextInt();
		
		int i = 1;
		int sum = 0;
		
		while(i <= n) {
			sum += i;
			i++;
		}
		System.out.println("합은 : " + sum);
		System.out.println("최종 i의 값은 : " + i);
	}

}
