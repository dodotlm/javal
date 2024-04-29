package Chap02_variables;

public class _06_FloatDouble {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 1. float 타입의 변수 선언 및 초기화
		
		float fNum1 = 3.14f;
		float fNum2 = 3.14F;
		
		
		// 2. double 타입의 변수 선언 및 초기화
		
		double dNum1 = 89.3698;
		double dNum2 = 11.984;
		
		// 3. 실수형 타입의 연산
		
		float result1 = fNum1 + fNum2;
		
		double result2 = dNum1 / dNum2;
		
		double result3 = fNum1 + dNum2; // double에 float 들어가는 건 되는데 float에 double 들어가면 오류 난다. 작은 거에 큰 거 담으려고 하면 오류나는 느낌.
		
		
		
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		

	}

}
