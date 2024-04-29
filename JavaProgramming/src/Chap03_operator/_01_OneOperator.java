package Chap03_operator;

public class _01_OneOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 1. 부호 연산자
		
		int num1 = 10;
		
		System.out.println(+num1);
		System.out.println(-num1);
		
		System.out.println("==========================================");
		
		
		
		// 2. 증감 연산자
		// 2-1. 전위 증감 연산자
		
		int num2 = 20;
		
		if (++num2 > 20) {
			System.out.println(num2 + ": num2는 20보다 큽니다. 전위증감 연산자!");
			
			System.out.println("==========================================");
		}
		
		
		// 2-2. 후위 증감 연산자
		
		int num0 = 20;
		
		if (num0++ <= 20) {
			System.out.println(num0 + ": num0는 20보다 안큽니다. 후위증감 연산자!");
			
			System.out.println("==========================================");
		}
		
		System.out.println(num0--);
		
		// 3. 전위 후위 증감연산자의 혼합
		
		int num4 = 10;
		
		System.out.println(++num4);  //11
		System.out.println(++num4);  //12
		System.out.println(num4--);  //12
		System.out.println(--num4);  //10
		System.out.println(num4--);  //10
		System.out.println(--num4);  //8
		
		
		

	}

}
