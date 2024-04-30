package HomeWork;

import java.util.Scanner;

public class _0429_advance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("값을 입력해 주세요 : ");
		int money = sc.nextInt();
		
		int sum =money;
		
		System.out.println("50000원권 " + money/50000 + "매 입니다.");
		sum = sum - (money/50000)*50000;
		System.out.println("10000원권 " + sum/10000 + "매 입니다.");
		sum = sum - (sum/10000)*10000;
		System.out.println("5000원권 " + sum/5000 + "매 입니다.");
		sum = sum - (sum/5000)*5000;
		System.out.println("1000원권 " + sum/1000 + "매 입니다.");
		sum = sum - (sum/1000)*1000;
		System.out.println("500원권 " + sum/500 + "매 입니다.");
		sum = sum - (sum/500)*500;
		System.out.println("100원권 " + sum/100 + "매 입니다.");
		sum = sum - (sum/100)*100;
		System.out.println("50원권 " + sum/50 + "매 입니다.");
		sum = sum - (sum/50)*50;
		System.out.println("10원권 " + sum/10 + "매 입니다.");
		sum = sum - (sum/10)*10;
		
		
	}

}
