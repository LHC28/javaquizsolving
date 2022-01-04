package inheritance;

public class HealthInfo {

	protected String name;
	protected int height;
	protected int weight;
	
	public HealthInfo(String name, int height, int weight) {
		this.name = name;
		this.height = height;
		this.weight = weight;
	}
	
	public void showInfo() {
		System.out.println(name + "���� ���� " + height + ", ������ " + weight + "kg �Դϴ�.");
	}
	
	public String getName() {
		return name;
	}
	
	public int getHeight() {
		return height;
	}
	
	public int getWeight() {
		return weight;
	}
}
