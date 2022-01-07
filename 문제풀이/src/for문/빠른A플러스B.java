package for문;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class 빠른A플러스B {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int T = Integer.parseInt(br.readLine());
		for(int i=1; i<=T; i++) {
			String a = br.readLine();
			String array[] = a.split(" ");
			int sum = Integer.parseInt(array[0])+Integer.parseInt(array[1]);
			bw.write(sum+"\n");
		}
		bw.close();
	}
}
