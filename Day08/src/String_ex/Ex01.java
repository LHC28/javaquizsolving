package String_ex;

public class Ex01 {

	public static void main(String[] args) {
		
		String s1 = "eclipse";
		
		//charAt : n��° index�� ���� ���ڰ� �ִ��� Ȯ��
		char index4 = s1.charAt(4);
		System.out.println("charAt : "+index4);
		
		//contains : Ư�� ���ڿ��� ���ڿ��� ���ԵǾ��ִ��� Ȯ��
		System.out.println("contains : "+s1.contains("lip"));
		System.out.println("contains : "+s1.contains("a"));
		
		//startsWith : Ư�� ���ڿ��� �����ϴ� Ȯ��
		System.out.println("startWith : "+s1.startsWith("ecl"));
		System.out.println("startWith : "+s1.startsWith("b"));
		
		//endsWith: Ư�����ڿ��� �������� Ȯ��
		System.out.println("endsWith : "+s1.endsWith("se"));
		System.out.println("endsWith : "+s1.endsWith("aaa"));
		
		//length : ���ڿ��� ���� Ȯ��. ���Ĺ��� �����
		System.out.println("length : "+s1.length());
		
		//replace : ���Ե� ���ڿ� �κ��� ��ü(ġȯ)
		String s2 = "I stay hungry.";
		s2 = s2.replace("I", "You"); //�� �ٽ� �����ؾ��Ѵ�. Ȯ���ʼ�
		System.out.println("replace : "+s2);
		
		//split : Ư�� ��Ʈ���� �������� �߶� �迭�� �ִ´�.
		String s3 = "apple,melon,grape";
		String[] fruits = s3.split(",");
		System.out.println("split : "+fruits[0]+" "+fruits[1]+" "+fruits[2]);
		
		//substring : ���ڿ��� �ڸ���.
		String s4 = "javastudy";
		System.out.println("substring : "+s4.substring(4));
		
		//begin index : ���� �ε���
		//end index : �ڸ��� ���� �� �ε��� + 1
		System.out.println("substring param 2 : "+s4.substring(0,4)); //java
		System.out.println("substring param 2 : "+s4.substring(4,9)); //study
		
	}

}
