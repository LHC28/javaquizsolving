package fileio_ex;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;

public class Ex01 {

	public static void main(String[] args) throws Exception {

		// ���� ����
		// ���� ��� : workspace\������Ʈ ��ġ\output.txt
		
		FileOutputStream fos = new FileOutputStream("output.txt",false);
		//true�� �ϰ� �Ǹ� ������ �ִ� ���Ͽ� �����̴� ��. false�� ��� ���� ���� ���̴�.
		OutputStreamWriter osw = new OutputStreamWriter(fos,"utf-8");
		BufferedWriter bw = new BufferedWriter(osw);
		
		String text = "�ȳ��ϼ���.\n�� �̸��� �������Դϴ�.";
		bw.write(text);
		bw.close();
		
	}

}
