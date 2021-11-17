package fileio_ex;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Ex02 {

	public static void main(String[] args) throws Exception {

		// ���� �б�
		FileInputStream fis = new FileInputStream("output.txt");
		InputStreamReader isr = new InputStreamReader(fis,"utf-8");
		BufferedReader br = new BufferedReader(isr);
		
		//readLine()�� Ŀ�� �����̴�. ���������� null�� ����Ű�� �ȴ�.
//		System.out.println(br.readLine());
//		System.out.println(br.readLine());
//		System.out.println(br.readLine());
//		System.out.println(br.readLine());
		
		while(true) {
			String line = br.readLine();
			if(line==null) {
				//�� �̻� ����Ű�� ������ �ݺ����� ����
				break;
			}
			
			System.out.println(line);
		}
		
		br.close();
	}

}
