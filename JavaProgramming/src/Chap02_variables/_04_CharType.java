package Chap02_variables;

public class _04_CharType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 1. char 타입의 변수 선언

		char ch1 ='A';
		
		//유니코드 값을 알고 있으면 유니코드 값으로 저장가능
		char ch2 = 65;
		
		System.out.println(ch1);
		System.out.println(ch2);
		
		// 결과값은 문자로 나옴.
		
		
		// 2. 유니코드 값을 모르는 문자의 유니코드 값 추출
		
		char ch3 ='자';
		
		System.out.println((int)ch3); //강제 형변환
		
		int unicode = '자';
		
		System.out.println(unicode);
		
		
		// 문자 하나는 작은 따옴표로 표시하고 char 타입의 변수에 할당하지만
		// 문자열 (String 클래스 사용)은 큰 따옴표로 표시한다.(참조 타입 변수에 저장)
		
		String str = "java";
		
		// 3. 유니코드에는 완전한 빈칸이 없다. 그래서 빈칸을 char 타입 변수에 저장하면 에러가 발생한다.
		
		char ch5 =' ';
		System.out.println("char ch4 ='' \"System.out.println(ch4)\" : 하면 오류가 나고");
		System.out.println("char ch5 =' ' \"System.out.println(ch5)\" : " + ch5 + "<<오류가 안난다");
		//물론 문자열의 타입에서는 완전 빈칸을 사용할 수 있다.
		String empty = "";
		
		
		
		
	}

}
