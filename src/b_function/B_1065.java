package b_function;

import java.util.Scanner;

public class B_1065 {
	static int count = 0;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		for(int i=1; i<=N; i++) {
			checkHansu(i);
		}
		System.out.println(count);
	}
	
	public static void checkHansu(int num) {
		if(num < 100) {
			count++;
		}else if(num == 1000){
			
		}else {
			int a = num/100;
			num -= a*100;
			int b = num/10;
			num -= b*10;
			int c = num;
			if((b-a) == (c-b)) {
				count++;
			}
		}
	}
	
}
