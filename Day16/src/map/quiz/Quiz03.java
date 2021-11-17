package map.quiz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class Quiz03 {
	//final keyword : ����, �ѹ��� �ʱ�ȭ �ǵ��� �ϴ� ��
	//1. ���� : ������ ���̸� �� �� �ʱ�ȭ �� ������ ���� ���Ҵ� �Ұ�
	//2. �޼ҵ� : �޼ҵ忡 ���̸� �������̵� �Ұ�
	//3. Ŭ���� : ��� �Ұ�
	public static final Map<String, String> capitalMap = new HashMap<String, String>() {
		//new�� ����� ��ü�� ���� �� ���ٴ� �ǹ�. ���� ��Ҵ� ������ �����ϴ�.
        {
            put("���ѹα�", "����");
            put("����ũ", "�����ϰ�");
            put("����", "������");
            put("���þ�", "��ũ��");
            put("���⿡", "���");
            put("�����", "���������");
            put("������", "����Ȧ��");
            put("������", "����");
            put("������", "���帮��");
            put("�Ƹ���Ƽ��", "�ο��뽺���̷���");
            put("����Ʈ", "ī�̷�");
            put("�̶�", "�����");
            put("��Ż����", "�θ�");
            put("�Ϻ�", "����");
            put("�ʸ���", "���Ҷ�");
            put("�ɶ���", "���Ű");
            put("������", "�ĸ�");
            put("��Ű", "��ī��");
            put("ĳ����", "��Ÿ��");
            put("�ݷҺ��", "����Ÿ");
        }
    };

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();

		
		
		Set<String> keys = new HashSet<>();
		keys = capitalMap.keySet();
		List<String> capitals = new ArrayList<>(keys);
		
		int[] nums = {-1,-1,-1,-1,-1};
		boolean check = false;
		
		//�ߺ�üũ��
		//����Ʈ�� �ϴ� ���� �� �����ϴ�.
		int score = 0;
		int count = 0;
		while(count<5) {
			int num = ran.nextInt(20);
			for(int i=0; i<nums.length; i++) {
				if(num==nums[i]) {
					check = true;
				}
			}
			if(check==false) {
				nums[count]=num;
				count+=1;
			}
		}
		
		//����
		for(int i=0; i<nums.length; i++) {
			System.out.print(capitals.get(nums[i])+"�� ���� �̸���?");
			String answer = scan.next();
			if(capitalMap.get(capitals.get(nums[i])).equals(answer)) {
				System.out.println("����");
				score+=100/nums.length;
			}else {
				System.out.println("Ʋ�Ƚ��ϴ�...");
			}
		}
		System.out.println("�� ������ "+score);
		
		
		
	}

}
