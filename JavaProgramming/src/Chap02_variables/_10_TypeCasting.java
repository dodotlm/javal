package Chap02_variables;

public class _10_TypeCasting {

	public static void main(String[] args) {
		
		// 1. 자동 형변환 1 : byte 크기가 작은 타입에서 큰 타입으로는 자동형변환이 일어난다.
		
		short sNum1 = 10;
		
		// short는 2byte고 int는 4byte이기 때문에 sNum1이 자동으로 int 타입으로 변환된다.
		
		int iNum1 = sNum1;
		
		
		// 2. 자동형변환 2 : 좀 더 세밀한 표현범위를 갖는 타입으로 자동형변환이 일어난다. (정수 -> 실수)
		
		long lNum1 = 200L;
		float fNum1 = lNum1;
		// long은 8byte고 float은 4byte로 롱이 바이트 크기는 더 크지만 플롯이 더 세밀한 표현범위를 가지고 있기 때문에 플롯으로 변환된다.
		
		
		// 3. 강제 형변환 1 : byte 크기가 큰 타입에서 작은 타입으로 변환할 때는 타입을 명시해 줘야한다.
		
		int iNum2 = 60;
		
		short sNum2 = (short)iNum2;
		
		// 4. 강제 형변환 2 : 덜 세밀한 표현범위를 갖는 타입으로 변환할 때도 타입을 명시해줘야 한다.
		
		float fNum2 = 3.14f;
		// long이 float보다 덜 세밀한 표현범위를 가지고 있기 때문이다.
		long lNum2 = (long)fNum2;
		
		// 5. 연산에서의 형변환
		
		// 형변환 순서에 따라서 연산중에 byte 크기가 더 큰 타입이나 좀 더 세밀한 표현범위를 갖는 타입으로 자동 형변환이 일어난다.
		//연산의 결과도 형변환된 타입으로 나타난다.
		
		long result1 = lNum1 + iNum1;
		
		
		int result2 = (int)lNum1 + iNum1;
		int result3 = (int)(lNum1 + iNum1);
		
		System.out.println(result2);
		System.out.println(result3);
		
		
		// 6. 문자열 결합 연산
		// 문자열 결합 연산에서는 모든 타입이 문자열로 변환된 후 문자열과 결합된다.
		String str = "bitcamp";
		int classroom = 502;
		double dNum1 = 11.552;
		
		String combineStr = str + classroom;
		
		System.out.println(combineStr + " " + dNum1);
		
		int i;
		
		for (i=0; i < 100; i++)
		{
			System.out.println("시간과 정신의 방에 오신걸 환영합니다.\n");
		}
		

	}

}
