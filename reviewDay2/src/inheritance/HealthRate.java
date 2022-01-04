package inheritance;

public class HealthRate extends HealthInfo {

	public HealthRate(String name, int height, int weight) {
		super(name, height, weight);
	}
	
	public double SW() {
		return (this.height-100)*0.9;
	}
	
	public double B() {
		return ((weight-height)/SW()) * 100;
	}
	
	public void printHealthRate() {
		if(B()<10) {
			System.out.println(this.name+"�� ���� "+this.height+", ������ "+this.weight+"kg => �����Դϴ�.");
		}else if(B()>=10 && B()<20) {
			System.out.println(this.name+"�� ���� "+this.height+", ������ "+this.weight+"kg => ��ü���Դϴ�.");
		}else if(B()>=20) {
			System.out.println(this.name+"�� ���� "+this.height+", ������ "+this.weight+"kg => ���Դϴ�.");
		}
		
	}
}
