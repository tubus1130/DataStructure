package b_math;

import java.util.Scanner;

public class B_10757 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			long A = Long.parseLong(sc.next());
			long B = Long.parseLong(sc.next());
			System.out.println(A+B);
			sc.close();			
		}catch(NumberFormatException e) {
			
		}
	}
}
