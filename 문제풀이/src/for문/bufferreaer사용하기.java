package for��;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class bufferreaer����ϱ� {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String s = bf.readLine();
		StringTokenizer st = new StringTokenizer(s); //��ȣ �ȿ� �Է� ���ڿ� �ֱ�
		int a = Integer.parseInt(st.nextToken()); //ù��° ȣ��
		String array[] = s.split(" ");//���鸶�� ������ ��� �迭�� �ֱ�
		
		//�Ҵ�� ���ۿ� �� �־��ֱ�
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String t = "abcdefg"; // ����� ���ڿ�
		bw.write(s+"\n"); // ���ۿ� �ִ� �� ���� ��� - �������� ���� ������ ���� �־��־�� �Ѵ�.
		bw.flush(); //�����ִ� �����͸� ��� ��½�Ŵ
		bw.close(); // ��Ʈ���� ����
	}
}
