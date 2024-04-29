package Chap04_controlstatement;

public class _03_ForStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 1. 1~100까지의 합
		
		int sum =0;
		
		int i;
		
		for (i = 1; i <= 100; i++)
		{
			sum = sum + i;
		}
		
		System.out.println("1~100까지의 합 : " + sum);
		
		
		System.out.println("=========================");
		
		
		// 2. 1~100까지 정수 중 2와 3의 공배수만 출력
		
		int j;
		
		for (j=1; j <=100; j++)
		{
			if (j % 2 == 0 && j % 3 == 0)
			{
				System.out.println(j);
			}
		}
		
		
		
		System.out.println("=========================");
		System.out.println("=========================");
		// 3. 정수 312의 모든 약수를 출력하는 for문을 작성하세요
		
		
		int k;
		
		for (k=1; k<=312; k++)
		{
			if(312 % k == 0)
			{
				System.out.println(k);
			}
		}
		
		
		System.out.println("=========================");
		
		
		// 4. for문 변형
		
		
		int l = 1;
		int sum3 = 0;
		
		// 무한반복되는 for문의 형태
		// break문을 이용해서 특정 조건이 됐을 때 for문을 종료시킨다.
		for ( ; ; )
		{
			sum3 += l++; //sum3 = sum3 + l++ // l에 10이 돌아오는 차례에 l++는 11이 되는 것이 자명하다. 하지만 적어도 이 줄에서는 10이다. 이 줄이 지나가고 앞으로 l은 무조건 11이 되는 것이다. 
			if( l > 10)
			{
				System.out.println(l);
				System.out.println("1~10까지의 합 : " + sum3);
				break;
			}
			
			
		}
		
		
		
		
		
		

	}

}
