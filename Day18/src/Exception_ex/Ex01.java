package Exception_ex;

public class Ex01 {

	public static void main(String[] args) throws Exception { //메인보다 앞서 진행되는 쪽에 에러를 넘기는 것
		// 예외처리 : 예상치 못한 상황에 대한 처리를 하는 것
		// try - catch - finally
		
		//NPE
		try {
//			String str = null;
//			System.out.println(str.isEmpty());
			
			//위의 에러를 잡고 catch로 넘어가서 아래는 수행이 되지 않음
			//배열 참조 범위 오류
//			int[] arr = {1,2,3};
//			for(int i=0; i<=arr.length; i++) {
//				System.out.println(arr[i]);
//			}
			
			//캐스팅 예외
			Object x = new Integer(0);
			System.out.println((Integer) x);
			
		}catch(NullPointerException npe){
			System.out.println("NPE 발생");
			
			npe.printStackTrace();
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("배열 참조 오류 발생했다.");
			e.printStackTrace();
		}catch(Exception e) {
			System.out.println("모든 예외를 다 잡는다.");
			e.printStackTrace();
		}finally {
			System.out.println("예외든 아니든 무조건 불려진다.");
		}
		
		System.out.println("수행완료");

		//이렇게 되면 직접 처리하는 것
		try {
			a();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	//중요한 것은 아님
	public static void a() throws Exception { //(본인이 안 하고 다른 애한테 넘기는)
		b();
	}
	
	public static void b() throws Exception {
		//예외 발생 시키기
		
		//checked exception : Exception -try-catch 예외처리
		//unchecked exception : RuntimeException - 바로 프로그램이 중지 된다.
		
//		throw new RuntimeException();
		
		// 처리 방법 2가지
		// 1. 내가 처리한다. (try-catch)
		// 2. 회피한다.     (throws)
		throw new Exception();
	}

}
