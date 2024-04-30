package HomeWork;

import java.util.Scanner;

public class _0429_advance2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("(1부터 99까지)값을 입력해 주세요 : ");
		
		int num = sc.nextInt();
		int num10 = num/10;
		int num1 = num - (num/10)*10;
		
		if (num10 % 3 == 0 || num1 % 3 == 0) {
			if (num10 % 3 == 0 && num1 % 3 == 0) {
				System.out.println("박수짝짝");
			}
			else {
				System.out.println("박수짝");
			}
		}

	}

}
