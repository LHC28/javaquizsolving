package fileio_ex;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;

public class Ex03 {

	public static void main(String[] args) throws Exception {

		// ���� �б�
		FileInputStream fis = new FileInputStream("src/fileio_ex/input_txt"); //��� ���
		InputStreamReader isr = new InputStreamReader(fis, "utf-8");
		BufferedReader br = new BufferedReader(isr);
		
		String line = br.readLine();
		Integer count = Integer.parseInt(line);
		
		for(int i=0; i<count; i++) {
			String text = br.readLine();
			String[] word = text.split(" ");
			
			//������ Ȯ��
			if(word[0].equals(word[1])) {
				System.out.println(true);
			}else {
				System.out.println(false);
			}
		}
	}

}
