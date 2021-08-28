package jungol;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main_JO_1205_조커v2 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		LinkedList<Integer> seq = new LinkedList<>();
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int joker = 0;
		
		for (int i = 0 ; i < N ; i++) {
			int num = Integer.parseInt(st.nextToken());
			if (num == 0) {
				joker++;
			} else {
				seq.add(num);
			}
			
		}
		
		Collections.sort(seq);
		
		
	}
}
