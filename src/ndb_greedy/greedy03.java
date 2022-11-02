package ndb_greedy;

import java.util.Scanner;

/*
 * 이코테
 * <문제>1이 될때까지
 */
public class greedy03 {
	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		int k = sc.nextInt();
//		int cnt = 0;
//		while(n != 1) {
//			if(n % k == 0) {
//				n = n / k;
//			}else {
//				n -= 1;
//			}
//			cnt++;
//		}
//		System.out.println(cnt);
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int result = 0;
		
		while(true) {
			int target = (n/k) * k;
			result += n - target;
			n = target;
			
			if(n < k) {
				break;
			}
			result += 1;
			n = n / k;
		}
		result += n-1;
		System.out.println(result);
		
	}
}
