package Chap02_variables;

public class _02_ScopeOfVariables {

	//여기서 선언되는 변수는 클래스 변수 (인스턴스 변수)
	// 클래스 중괄호 안에서는 어디서든 언제든지 접근이 가능하다.
	static int num;
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1-1. 클래스 변수의 사용
		num = 100;
		System.out.println(num);
		
		
		// 2. 지역변수 선언
		// main 메소드 안에서 선언되었기 대문에 main 메소드 중괄호 내에서만 접근이 가능하다.
		int mainMethodNum = 10;
		int sum = 0;
		
		
		if (sum == 0)
		{
			int ifNum = 30;
			//mainMethodNum, sum은 if문 중괄호 블록보다 상위인 메소드 중괄호 블럭에서 선언되었기 때문에
			//if문 안에서 사용가능하다.
			sum = mainMethodNum + ifNum;
			
			System.out.println(sum);
		}
		
		System.out.println("\"ifNum\"은 여기서 쓸 수 없다.");
		System.out.println("\"sum\"은 그러나 if문 밖에 있었으므로 쓸 수 있다.");
		
		// 4-1. 메소드의 호출
		// 밑의 메소드에서 정의된 변수들은 이때 메모리에 저장되었다가 메소드가 종료되는 시점에 메모리에서 삭제된다.
		getSum();
		//메소드 종료.
		
		System.out.println("System.out.println(localResult)는 더이상 쓸 수없다. 왜냐면 메소드가 끝나서 메모리에 더 이상 변수들이 남아있지 않기 때문.");
		
		
		
		
		
	}
	
	public static void getSum()
	{
		
		
		// 2-1. main 메소드 선언된 다른 변수를 다른 메소드에서 호출하게 되면 에러가 발생한다.
		System.out.println("\"mainMethodNum\"는 쓸 수 없다.");
		
		// 4. 메소드의 지역변수 선언
		//메소드의 지역변수들은 메소드가 실행될 때 메모리에 저장되었다가 메소드의 실행이 끝나면 자동으로 메모리에서 삭제되게 된다.
		int localVal1 = 50;
		int localVal2 = 60;
		
		int localResult = localVal1 + localVal2;
		
		System.out.println("getSum메소드에서 계산 결과 : " + localResult);
	}

}
