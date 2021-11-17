package fileio_quiz2;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;

public class Quiz01 {

	public static void main(String[] args) throws Exception {
		
		FileInputStream fis = new FileInputStream("src/fileio_quiz2/input.txt"); //경로 명시
		InputStreamReader isr = new InputStreamReader(fis, "utf-8");
		BufferedReader br = new BufferedReader(isr);
		
		int count = Integer.parseInt(br.readLine());
		
		for(int i=0; i<count; i++) {
			String text = br.readLine();
			String[] nums = text.split(" ");
			double num = Double.parseDouble(nums[0]);
			
			for(int j=1; j<nums.length; j++) {
				if(nums[j]=="@") {
					num*=3;
				}else if(nums[j]=="%") {
					num+=5;
				}else if(nums[j]=="#") {
					num-=7;
				}
			}
			num = (num*100)/100.0;
			System.out.println(num);
			
		}
		
		
	}
}
