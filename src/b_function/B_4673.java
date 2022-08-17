package b_function;


public class B_4673 {
	public static void main(String[] args) {
		boolean check[] = new boolean[10001];
		for(int i=1; i<=10000; i++) {
			int n = count(i);
			
			if(n <= 10000) {
				check[n] = true;
			}
		}
		
		StringBuilder sb = new StringBuilder();
		for(int i=1; i<=10000; i++) {
			if(!check[i]) {
				sb.append(i).append("\n");
			}
		}
		System.out.println(sb);
	}
	
	public static int count(int number) {
		int sum = number;
		while(number != 0) {
			sum += number % 10;
			number /= 10;
		}
		return sum;
	}
}
