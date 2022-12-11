package doit.chap01;

public class Q1 {

	public static void main(String[] args) {
		System.out.println(max4(2,1,3,4));
		System.out.println(min3(3,1,2));
	}
	
	public static int max4(int a, int b, int c, int d) {
		int max = a;
		if(b > max) {
			max = b;
		}
		if(c > max) {
			max = c;
		}
		if(d > max) {
			max = d;
		}
		return max;
	}
	
	public static int min3(int a, int b, int c) {
		int min = a;
		if(min > b) {
			min = b;
		}
		if(min > c) {
			min = c;
		}
		return min;
	}

}
