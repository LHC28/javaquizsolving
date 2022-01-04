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
			System.out.println(this.name+"의 신장 "+this.height+", 몸무게 "+this.weight+"kg => 정상입니다.");
		}else if(B()>=10 && B()<20) {
			System.out.println(this.name+"의 신장 "+this.height+", 몸무게 "+this.weight+"kg => 과체중입니다.");
		}else if(B()>=20) {
			System.out.println(this.name+"의 신장 "+this.height+", 몸무게 "+this.weight+"kg => 비만입니다.");
		}
		
	}
}
