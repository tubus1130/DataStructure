package b_투포인터;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;


public class B_3273 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		int[] arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(arr);
		
		int start = 0;
		int end = n-1;
		int count = 0;
		st = new StringTokenizer(br.readLine());
		int target = Integer.parseInt(st.nextToken());
		while(start < end) {
			if(arr[end] + arr[start] > target) {
				end--;
			}else if(arr[end] + arr[start] < target) {
				start++;
			}else {
				count++;
				start++;
			}
		}
		System.out.println(count);
	}

}
