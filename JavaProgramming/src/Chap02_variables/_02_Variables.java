package Chap02_variables;





public class _02_Variables {

	static int classCnt = 100;

	public static void main(String[] args) {
		
		//1. 변수의 선언
		//1-1. 변수의 선언은 자료형 + 변수명
		//좋아요 갯수를 저장하는 변수
		
		int likeCnt = 100;
		//로그인한 사용자가 좋아요를 눌렀는지 여부를 저장하는 변수
		boolean isUserLike;
		
		//1-2. 변수명 첫 글자는 문자, $, _만 허용된다.
		int price;
		int _bit;
		int $company;
		
		// 문자, $, _가 아닌 다른 기호, 숫자가 첫 글자로 오면 에러가 발생한다.
		
		//1-3. camel case 표기법 사용
		// 게시물 갯수
		int boardCnt;
		//출력횟수
		int printCnt;
		
		//1-4. 대소문자를 구분한다.
		int lunchTime;
		int luNchTime;
		int lunchtme;
		
		//1-5. 본인만 알아볼 수 있는 변수명을 사용하면 안된다.
		
		System.out.println("변수의 선언은 자료형 + 변수명");
		System.out.println("변수명 첫 글자는 문자, $, _만 허용된다.");
		System.out.println("대소문자를 구분한다.");
		System.out.println("본인만 알아볼 수 있는 변수명을 사용하면 안된다.");
		System.out.println("camel case 표기법 사용");
		
		//2. 변수의 사용
		//2-1. 변수에 값 지정(할당)
		//변수에 값을 최초로 저장하는 것을 초기화 라고 한다.
		likeCnt = 1000;
		
		System.out.println("likeCnt : " + likeCnt);
		System.out.println("syso + ctrl + space = System.out.println();");
		
		//변수의 값 재할당
		likeCnt = 100;
		System.out.println("likeCnt : " + likeCnt);
		
		
		//2-2. 변수의 선언과 동시에 초기화
		int studentCnt = 100;
		
		System.out.println("studentCnt : " + studentCnt);
		
		//2-3. 선언된 변수에는 지정된 자료형의 값만 저장할 수 있다.
		System.out.println("studentCnt = 11.11 " + "에러가 난다!");
		
		//2-4. 초기화(값이 지정되지 않은)되지 않은 변수를 사용하게 되면 에러가 발생하게 된다.
		int erroval;
		System.out.println("System.out.println(\"erroval\");" + "  지정하지 않은 변수는 에러가 발생하게 된다");
		
		
		
	}
	
	
	
	
	public static void sub (String[] args)
	{
		System.out.println(classCnt);
	}

}
