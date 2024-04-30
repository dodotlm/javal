package HomeWork;

import java.util.Scanner;

public class _0429_Basic {

	public static void main(String[] args) {
		
		System.out.println("1번 문제\n");
		
		int num = 10;
		
		System.out.println(++num);
		System.out.println(++num);
		System.out.println(num--);
		System.out.println(--num);
		System.out.println(num--);
		System.out.println(--num);
		
		System.out.println("\n2번 문제\n");
		int a = 10;
		int b = 20;
		boolean a1 = a<b;
		boolean a2 = a>b;
		System.out.println(a1);
		System.out.println(a2);
		
		
		System.out.println("\n3번 문제\n");
		
		int w1 = 10;
		while(w1 >= 1) {
			System.out.println(w1);
			--w1;
		}
		
		System.out.println("\n4번 문제\n");
		
		int w2 = 10;
		do {
			System.out.println(w2);
			--w2;
		}while(w2>=1);
		
		System.out.println("\n5번 문제\n");
		
		for(int i =10; i>=1; i--)
		{
			System.out.println(i);
		}
		
		System.out.println("\n6번 문제\n");
		
		int w3 = 1;
		int wsum1 = 0;
		
		while(w3<=100) {
			wsum1 = wsum1 + w3;
			++w3;
		}
		System.out.println(wsum1);
		
		System.out.println("\n7번 문제\n");
		
		int w4 = 100;
		int wsum2 = 0;
		do {
			wsum2 = wsum2 + w4;
			--w4;
		}while(w4>=1);
		System.out.println(wsum2);
		
		
		System.out.println("\n8번 문제\n");
		
		int sum1 = 0;
		for(int i =1; i<=100; i++)
		{
			sum1 = sum1 + i;
		}
		System.out.println(sum1);
		
		
		System.out.println("\n9번 문제\n");
		
		int[] str = new int[10];
		
		for(int k = 0; k <str.length; k++) {
			str[k] = (k+1)*3;
		}
		for(int h = (str.length)-1; h >= 0; h--) {
			System.out.println(str[h]);
		}
		
		System.out.println("\n10번 문제\n");
		
		int[] str2 = new int[10];
		int sum3 = 0;
		
		Scanner sc = new Scanner(System.in);
		
		for(int y = 0; y <= 9; y++) {
			System.out.print("숫자를 입력해 주세요 : ");
			int hole = sc.nextInt();
			str2[y] = hole;
			sum3 = sum3 + str[y];
		}
		
		for(int p = 0; p <= 9; p++) {
			System.out.println(str2[p]);
		}
		
		System.out.println(sum3);
		
		
		
		

	}

}
