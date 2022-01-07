package for문;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class bufferreaer사용하기 {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String s = bf.readLine();
		StringTokenizer st = new StringTokenizer(s); //괄호 안에 입력 문자열 넣기
		int a = Integer.parseInt(st.nextToken()); //첫번째 호출
		String array[] = s.split(" ");//공백마다 데이터 끊어서 배열에 넣기
		
		//할당된 버퍼에 값 넣어주기
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String t = "abcdefg"; // 출력할 문자열
		bw.write(s+"\n"); // 버퍼에 있는 값 전부 출력 - 개행기능이 없기 때문에 직접 넣어주어야 한다.
		bw.flush(); //남아있는 데이터를 모두 출력시킴
		bw.close(); // 스트림을 닫음
	}
}
