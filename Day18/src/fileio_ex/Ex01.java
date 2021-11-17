package fileio_ex;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;

public class Ex01 {

	public static void main(String[] args) throws Exception {

		// 파일 쓰기
		// 파일 경로 : workspace\프로젝트 위치\output.txt
		
		FileOutputStream fos = new FileOutputStream("output.txt",false);
		//true로 하게 되면 기존에 있는 파일에 덧붙이는 것. false인 경우 새로 쓰는 것이다.
		OutputStreamWriter osw = new OutputStreamWriter(fos,"utf-8");
		BufferedWriter bw = new BufferedWriter(osw);
		
		String text = "안녕하세요.\n제 이름은 가나다입니다.";
		bw.write(text);
		bw.close();
		
	}

}
