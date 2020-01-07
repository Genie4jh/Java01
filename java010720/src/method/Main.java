package method;

public class Main {

	public static void main(String[] args) {
		// MethodClass 의 인스턴스를 생성
		MethodClass obj = new MethodClass();
		
		// 메소드 호출 - 수행할 내용을 변경하고자 하면 메소드의 내용만 변경
		obj.disp();
		
		System.out.println("Hello Python");
		
		// 메소드 호출
		obj.disp();
		
		// parameter 가 있는 메소드 호출
		System.out.println("=====================");
		obj.disp(5);
		System.out.println("=====================");
		obj.disp(2);
		
		
		int x = 100;
		int [] br = {100, 200, 300};
		obj.inc(x);
		// x의 값은 직접 호출해서 변경하지 않는 이상 절대로 변경되지 않음
		System.out.println("x:" + x);
		
		obj.dec(br);
		// 참조형의 경우, 메소드의 매개변수로 대입되면 데이터가 변경되어 있을 수도 있음
		System.out.println("br[0]:" + br[0]);
		
		// main 메소드에서 public void sum(int ... ar) 메소드 호출
		obj.sum(10, 30);
		obj.sum(20, 30, 10, 50);
		
		// 2개의 정수를 매개변수로 받아서 더한 후 결과를 '출력'하는 메소드
		obj.addDisplay(100, 200);
		
		// return 이 있는 메소드
		// 메소드의 수행 결과를 r에 저장
		int r = obj.addReturn(200, 300);
		System.out.println("결과:" + r);
		// 이전 작업 결과를 가지고 다음 작업을 수행
		r = obj.addReturn(r, 700);
		System.out.println("결과:" + r);
		
		// return 값이 메소드는 다른 메소드의 매개변수가 될 수 있습니다.
		r = obj.addReturn(300, obj.addReturn(300, 700));
		System.out.println("결과:" + r);
	}
}

