package b_for;

import java.util.Scanner;

public class B_25304 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int total = sc.nextInt();
		int loop = sc.nextInt();
		int sum = 0;
		for(int i=0; i<loop; i++) {
			sum += sc.nextInt() * sc.nextInt();
		}
		if(total == sum) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
		sc.close();
	}
}
