package Chap02_variables;

public class _07_BooleanType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 1. 사용자 id 지정
		
		String userId = "bitcamp502";
		
		// 2. boolean 타입의 변수 선언
		// boolean 타입은 true나 false 두 가지 값만 저장 할 수 있다.
		// 유효성 검사 플래그로 사용할 boolean 변수 
		boolean isValidated = false;
		
		
		// 3. 사용자의 id가 8자리 이상 20자리 이하면 유효한 id로 판단
		
		if(userId.length() >= 8 && userId.length() <= 20)
		{
			isValidated = true;
		}
		
		
		
		if (isValidated)
		{
			System.out.println("사용가능한 아이디 입니다.");
		}
		else
		{
			System.out.println("아이디는 8자리에서 20자리로 설정해 주세요.");
		}

	}

}
