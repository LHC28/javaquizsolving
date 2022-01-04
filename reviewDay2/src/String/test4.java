package String;

public class test4 {

	public static void main(String[] args) {
		String[] files = {"cat.jpg", "dog.png", "kakao.exe", "tree.jpg", "eclipce.exe", "tmp.txt", "phone.jpg"};
		int count = 0;
		for(int i=0; i<files.length; i++) {
			if(files[i].contains("jpg")) {
				count+=1;
			}
		}
		System.out.println(count);
		
		
	}
}
