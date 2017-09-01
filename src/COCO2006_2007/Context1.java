package COCO2006_2007;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

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
		HashSet<Integer> hs = new HashSet<Integer>();
		try {
			hs.add(Integer.parseInt(br.readLine()) % 42);
			hs.add(Integer.parseInt(br.readLine()) % 42);
			hs.add(Integer.parseInt(br.readLine()) % 42);
			hs.add(Integer.parseInt(br.readLine()) % 42);
			hs.add(Integer.parseInt(br.readLine()) % 42);
			hs.add(Integer.parseInt(br.readLine()) % 42);
			hs.add(Integer.parseInt(br.readLine()) % 42);
			hs.add(Integer.parseInt(br.readLine()) % 42);
			hs.add(Integer.parseInt(br.readLine()) % 42);
			hs.add(Integer.parseInt(br.readLine()) % 42);	
		} catch (IOException e){
			e.printStackTrace();
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}	
		System.out.println(hs.size());
	}
}
