package b_구간합;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B_16139 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String S = br.readLine();
		int[][] sum = new int[S.length()][26];
		
		// 첫번째 열 초기화
		sum[0][S.charAt(0) - 'a']++;
		
		// 2~마지막 누적합
		for(int i=1; i<S.length(); i++) {
			int temp = S.charAt(i) - 'a';
			
			for(int j=0; j<26; j++) {
				sum[i][j] = sum[i-1][j];
			}
			sum[i][temp]++;
		}
		
		int q = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i<q; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			char alpha = st.nextToken().charAt(0);
			int l = Integer.parseInt(st.nextToken());
			int r = Integer.parseInt(st.nextToken());
			
			if(l == 0) {
				sb.append(sum[r][alpha - 'a'] + "\n");
			}else {
				sb.append(sum[r][alpha - 'a'] - sum[l-1][alpha - 'a'] + "\n");
			}
		}
		System.out.println(sb);
	}
}
