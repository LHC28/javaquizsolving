package fileio_ex;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Ex02 {

	public static void main(String[] args) throws Exception {

		// 파일 읽기
		FileInputStream fis = new FileInputStream("output.txt");
		InputStreamReader isr = new InputStreamReader(fis,"utf-8");
		BufferedReader br = new BufferedReader(isr);
		
		//readLine()은 커서 개념이다. 마지막에는 null을 가리키게 된다.
//		System.out.println(br.readLine());
//		System.out.println(br.readLine());
//		System.out.println(br.readLine());
//		System.out.println(br.readLine());
		
		while(true) {
			String line = br.readLine();
			if(line==null) {
				//더 이상 가리키지 않으면 반복문을 종료
				break;
			}
			
			System.out.println(line);
		}
		
		br.close();
	}

}
