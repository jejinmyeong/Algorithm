package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_BJ_11720_숫자의합 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		String str = br.readLine();
		
		int ans = 0;
		for (int i = 0 ; i < N ; i++) {
			ans += str.charAt(i)-'0';
		}
		
		System.out.println(ans);
	}
}
