package fileio_quiz;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;

public class Quiz01 {

	public static void main(String[] args) throws Exception {

		FileInputStream fis = new FileInputStream("src/fileio_quiz/input.txt"); //경로 명시
		InputStreamReader isr = new InputStreamReader(fis, "utf-8");
		BufferedReader br = new BufferedReader(isr);
		
		int count = Integer.parseInt(br.readLine());
		
		for(int i=0; i<count; i++) {
			String text = br.readLine();
			String[] loc = text.split(" ");
			int x = Integer.parseInt(loc[0]);
			int y = Integer.parseInt(loc[1]);
			if(x>0 && y>0) {
				System.out.println(1);
			}else if(x<0 && y>0) {
				System.out.println(2);
			}else if(x<0 && y<0) {
				System.out.println(3);
			}else if(x>0 && y<0){
				System.out.println(4);
			}
		}
	}

}
