package b_sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B_23968 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] arr = new int[Integer.parseInt(st.nextToken())];
		int k = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<arr.length; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		int cnt = 0;
		int first = 0, second = 0;
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr.length-1-i; j++) {
				int temp = 0;
				if(arr[j] > arr[j+1]) {
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					cnt++;
					if(cnt == k) {
						first = arr[j];
						second = arr[j+1];
					}
				}
			}
		}
		
		if(cnt == 0 || first == 0 || second == 0) {
			System.out.println("-1");
		}else {
			System.out.println(first + " " + second);
		}
	}

}
