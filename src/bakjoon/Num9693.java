package bakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 9360 KB, 148 MS */

public class Num9693 {
	StringBuilder sb;
	
	public static void main(String args[]) {
		Num9693 main = new Num9693();
		main.init();
	}
	
	void init() {
		sb = new StringBuilder();
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int N;
			int case_n = 1;
			while(true){
				N = Integer.parseInt(br.readLine(), 10);
				if(N == 0) break;
				solve(N, case_n++);				
			}
			System.out.println(sb.toString());
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	void solve(int N, int case_n) {
		/* 2부터 까지 각 숫자가 약수 2, 5를 몇 개나 가지고 있는지 count 한다.
		 * 가장 무식한 방법, 그냥 다 무식하게 계산하는 것.
		 * 2의 배수만 2를 약수로 가지고 있고, 5의 배수만 5 약수로 가지고 있다.
		 * */
		int temp;
		int five = 0;
		
		for (int i = 5; i <= N; i += 5) {	
			temp = i;
			while(true) {
				if(temp % 5 == 0) { temp /= 5; ++five; }
				else break;
			}
		}		
		sb.append("Case #" + case_n + ": " + five + "\n");
	}	
}
