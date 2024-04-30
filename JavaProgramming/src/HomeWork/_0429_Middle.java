package HomeWork;

import java.util.Random;

public class _0429_Middle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("1번 문제\n");
		for(int i = 1; i <= 100; i++) {
			if(i % 2 == 0 && i % 3 == 0)  {
				System.out.print(i + ", ");
			} 
		}

		
		System.out.println("\n2번 문제\n");
		
		int y=1;
		while(y <= 10) {
			if(y % 2 == 0) {
				System.out.println(y);
			}
			
			++y;
		}
		
		
		System.out.println("\n3번 문제\n");
		
		int r = 1;
		int sum1 = 0;
		while(r <=1000) {
			if( r % 2 == 0 && r % 7 == 0) {
				System.out.print(r + ", ");
				sum1 = sum1 + r;
			}
			++r;
		}
		System.out.println("\n" + sum1);
		
		System.out.println("\n4번 문제\n");
		
		int[] Arr = new int[20];
		
		Random random = new Random(100);
		
		for(int i =0; i <=(Arr.length)-1; i++) {
			Arr[i] = (random.nextInt(100))+1;
		}
		
		for(int t =0; t <=(Arr.length)-1; t++) {
			
			if( t % 2 != 0) {
				System.out.println(Arr[t]);
			}
			
		}
		for(int t2 = (Arr.length)-1; t2 >= 0; t2--) {
			
			if( t2 % 2 != 0) {
				System.out.println(Arr[t2]);
			}
			
		}
		
		System.out.println("\n6-1번 문제\n");
		
		for (int o = 1; o <= 5; o++) {
			for(int w = 1; w <= o; w++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		System.out.println("\n6-2번 문제\n");
		
		int o =5;
		for (o = 1; o <= 5; o++) {
			for(int w = 1; w <= 5-o; w++) {
				System.out.print(" ");
			}
			for(int f = 1; f <= o; f++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		System.out.println("\n6-3번 문제\n");
		
		int o1 =5;
		for (o1 = 1; o1 <= 5; o1++) {
			for(int n = 1; n <= 6-o1; n++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		System.out.println("\n6-4번 문제\n");
		
		int o3 =5;
		for (o3 = 1; o3 <= 5; o3++) {
			for(int f = 1; f <= o3-1; f++) {
				System.out.print(" ");
			}
			for(int w = 1; w <= 6-o3; w++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		
		

	}

}
