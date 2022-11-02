package ndb_greedy;

public class greedy01 {
	public static void main(String[] args) {
		int n = 1260;
		int count = 0;
		int[] coinType = {500, 100, 50, 10};
		
		for(int i=0; i<coinType.length; i++) {
			count += n / coinType[i];
			n %= coinType[i];
		}
		System.out.println(count);
	}
}