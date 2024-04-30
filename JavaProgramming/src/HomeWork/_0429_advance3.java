package HomeWork;

public class _0429_advance3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int r=0;
		for (int i =1; i <= 9; i+=2) {
			for(int w = 1; w < 5-(i/2); w++) {
				System.out.print(" ");
				
			}
			for(int u = 0; u<i; u++) {
				System.out.print("*");
			}
			System.out.println();
			
			
			
		}
		
		
		

	}

}
