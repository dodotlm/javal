package Chap02_variables;

public class _03_ByteType {

	public static void main(String[] args) {
		
		// 1. byte 타입의 변수 선언 및 초기화
		byte num1 = -128;
		byte num2 = 127;
		
		System.out.println(num1);
		System.out.println(num2);
		
		
		// 2. byte 범위를 초과하는 값을 저장하면 에러가 발생한다.
		
		System.out.println("이건 안된다 --> byte num3 = 128");
		System.out.println("이것도 안된다 --> byte num4 = -129");
		
		
		// 3. 증감연산자를 통해서 범위를 초과하는 값으로 변경
		// 증감 연산자 (++ , --)
		// num++ = num + 1
		// num-- = num - 1
		
		
		/*
		  num1  = num1 - 1
		  		= -128 -1
		  		= 1000 000 -1
		  		==> 0111 1111
		 */
		
		
		num1--;
		System.out.println(num1);
		num2++;
		System.out.println(num2);
		
		
		
		

	}

}
