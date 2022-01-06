package 분수찾기;

import java.util.Scanner;

public class test1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = 1;
		int count = 1;
		int count1=0;
		int input = scan.nextInt();
		while(true) {
			if(num<=input) {
				if(num+count>input) {
					break;
				}else {
					num+=count;
					count1+=count;
					count+=1;
				}
			}else if(num>input){
				System.out.println("에러");
				break;
			}
		}
		int a=count-(input-count1)+1;
		int b=(input-count1);
		if(count%2==0) {
			int temp=a;
			a=b;
			b=temp;
		}
		System.out.println(a+"/"+b);
	}
}
