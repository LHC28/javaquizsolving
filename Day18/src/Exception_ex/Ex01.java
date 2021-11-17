package Exception_ex;

public class Ex01 {

	public static void main(String[] args) throws Exception { //���κ��� �ռ� ����Ǵ� �ʿ� ������ �ѱ�� ��
		// ����ó�� : ����ġ ���� ��Ȳ�� ���� ó���� �ϴ� ��
		// try - catch - finally
		
		//NPE
		try {
//			String str = null;
//			System.out.println(str.isEmpty());
			
			//���� ������ ��� catch�� �Ѿ�� �Ʒ��� ������ ���� ����
			//�迭 ���� ���� ����
//			int[] arr = {1,2,3};
//			for(int i=0; i<=arr.length; i++) {
//				System.out.println(arr[i]);
//			}
			
			//ĳ���� ����
			Object x = new Integer(0);
			System.out.println((Integer) x);
			
		}catch(NullPointerException npe){
			System.out.println("NPE �߻�");
			
			npe.printStackTrace();
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("�迭 ���� ���� �߻��ߴ�.");
			e.printStackTrace();
		}catch(Exception e) {
			System.out.println("��� ���ܸ� �� ��´�.");
			e.printStackTrace();
		}finally {
			System.out.println("���ܵ� �ƴϵ� ������ �ҷ�����.");
		}
		
		System.out.println("����Ϸ�");

		//�̷��� �Ǹ� ���� ó���ϴ� ��
		try {
			a();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	//�߿��� ���� �ƴ�
	public static void a() throws Exception { //(������ �� �ϰ� �ٸ� ������ �ѱ��)
		b();
	}
	
	public static void b() throws Exception {
		//���� �߻� ��Ű��
		
		//checked exception : Exception -try-catch ����ó��
		//unchecked exception : RuntimeException - �ٷ� ���α׷��� ���� �ȴ�.
		
//		throw new RuntimeException();
		
		// ó�� ��� 2����
		// 1. ���� ó���Ѵ�. (try-catch)
		// 2. ȸ���Ѵ�.     (throws)
		throw new Exception();
	}

}
