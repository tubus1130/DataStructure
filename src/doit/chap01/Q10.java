// p35 Q10
// 자릿수
package doit.chap01;

import java.util.Scanner;

public class Q10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int cnt = 1;
		while(n > 10) {
			n = n / 10;
			cnt++;
		}
		System.out.println(cnt);
	}
}
