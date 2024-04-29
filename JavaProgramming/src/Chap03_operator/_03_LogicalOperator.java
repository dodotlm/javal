package Chap03_operator;

public class _03_LogicalOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 1.관계 연산자
		int num1 = 110;
		int num2 = 225;
		
		System.out.println("num1 : " + num1 + "  num2 : " + num2);
		
		System.out.println("num1 < num2: " + (num1 < num2));
		System.out.println("num1 <= num2: " + (num1 <= num2));
		System.out.println("num1 > num2: " + (num1 > num2));
		System.out.println("num1 >= num2: " + (num1 >= num2));
		System.out.println("num1 == num2: " + (num1 == num2));
		System.out.println("num1 != num2: " + (num1 != num2));
		
		System.out.println("=========================================");
		
		// ==, != 값의 동일여부를 비교할 때에는 기본자료형만 가능하다.
		// 참조형 변수들은 값이 heap 영역에 저장되어 있기 때문에
		// ==, !=을 이용해서 값을 비교하면 stack 메모리에 저장되어 있는 주소값을 비교한다.
		
		String str1 = new String("Hello");
		String str2 = new String("Hello");
		
		System.out.println("str1 == str2 : " + (str1 == str2));
		// 둘은 주솟값이 다르므로 false가 나오게 된다.
		
		//String의 경우에는 object에서 상속받아 오버라이드 된 equals라는 메소드를 사용하게 된다.
		
		System.out.println("str1 equals str2 : " + str1.equals(str2));
		
		
		
		// 3. 논리 연산자
		
		int num3 = 10;
		int num4 = 33;
		
		boolean result;
		
		//논리곱&& : 양쪽 항 모두 true일 때 true 리턴
		
		result = num1 < num2 && num3 / num4 == 0;
		
		System.out.println(result);
		
		
		//논리합|| : 양쪽 항 하나만이라도 true라면 true 리턴
		
		result = num1 > num2 || num3 / num4 == 0;
		
		System.out.println(result);
		
		
		// 부정 ! : true는 false로 false는 true로 바꿔주는 연산자이다.
		
		result = !(num4 > 200);
		
		System.out.println(result);
		
		

	}

}
