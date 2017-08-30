package COCO2006_2007;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Context1 {
	StringBuilder sb;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Context1 main = new Context1();
		main.init();
	}
	
	void init() {
		sb = new StringBuilder();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] arr = new int[10];
		int count = 0;
		try {
			arr[0] = Integer.parseInt(br.readLine()) % 42;
			arr[1] = Integer.parseInt(br.readLine()) % 42;
			arr[2] = Integer.parseInt(br.readLine()) % 42;
			arr[3] = Integer.parseInt(br.readLine()) % 42;
			arr[4] = Integer.parseInt(br.readLine()) % 42;
			arr[5] = Integer.parseInt(br.readLine()) % 42;
			arr[6] = Integer.parseInt(br.readLine()) % 42;
			arr[7] = Integer.parseInt(br.readLine()) % 42;
			arr[8] = Integer.parseInt(br.readLine()) % 42;
			arr[9] = Integer.parseInt(br.readLine()) % 42;
			
			Arrays.sort(arr);
			
			for(int i = 0; i < 9; ++i) {
				if(arr[i] != arr[i+1]) {
					++count;
				}
			}
			
		} catch (IOException e){
			e.printStackTrace();
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
		
		System.out.println(count);
	}

}
