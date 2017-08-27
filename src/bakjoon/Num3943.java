package bakjoon;

import java.util.Scanner;

public class Num3943 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);	

		int T = sc.nextInt();
		int n, max;
		
		for(int i=0; i<T; i++) {
			n = sc.nextInt();
			max = n;
			while(n != 1) {
				if(n % 2 == 0) {
					n = n / 2;
				} else {
					n= 3 * n + 1;
					if(n > max) {
						max = n;
					}
				}
			}
			System.out.println(max);
		}
		sc.close();
	}

}
