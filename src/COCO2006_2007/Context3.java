package COCO2006_2007;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Context3 {
	
	StringBuilder sb;
	String peter15 = ".*..";
	String peter24 = "#.#.";
	String peter3 = ''
	String

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Context3 main = new Context3();
		main.init();
	}
	
	void init() {
		String word;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			word = br.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		int lineLength = word.length() * 4 + 1;
		sb = new StringBuilder((lineLength + 1) * 5); //five line, +1 for \n
		
		for(int i = 0; i < 5; ++i) {
			for(int j = 0; j < lineLength; ++j) {
				
			}
			sb.append('\n');
		}
		
	}

}
