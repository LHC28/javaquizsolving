package map.quiz;

import java.util.ArrayList;
import java.util.List;

public class Stack {
	
	private List<String> stack = new ArrayList<>();
	private int top = -1;
	
//	public void push(String word) {
//		data.add(word);
//	}
	
	public boolean push(String value) {
		this.top++;
		this.stack.add(value);
		return this.stack.add(value);
	}
	
	public String pop() {
		//맨위 출력 후 삭제
		this.top--;
		return this.stack.remove(this.stack.size()-1);
	}
	
//	public void peek() {
//		System.out.println(stack.get(stack.size()-1));
//	}
	
	public String peek() {
		return this.stack.get(top);
	}
	
}
