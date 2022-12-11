// p31 Q8
// for문
package doit.chap01;

public class Q8 {

	public static int sumof(int a, int b) {
		int c = 0;
		int sum = 0;
		if(a > b) {
			c = a;
			a = b;
			b = c;
		}
		
		for(int i=a; i<=b; i++) {
			sum += i;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		System.out.println(sumof(3,5));
	}
}
