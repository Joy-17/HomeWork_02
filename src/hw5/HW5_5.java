package hw5;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class HW5_5 {
	public static void main(String[] args) {


		
		
		// 4.MyRectangle

		// 5.genAuthCode
		genAuthCode();

	}

	
	
	public static void genAuthCode() {
		System.out.println("本次隨機產生的驗證碼為：");

		
		ArrayList<Character> list = new ArrayList<>();
	
		
		for (int i = 'A'; i <= 'Z'; i++) {
			char c = (char) i;
			list.add(c);
		}

		for (int i = 'a'; i <= 'z'; i++) {
			char c = (char) i;
			list.add(c);
		}

		for (int i = '0'; i <= '9'; i++) {
			char c = (char)i;
			list.add(c);

		}
		for (int i = 0; i < 8; i++) {
			int index = (int) (Math.random() * list.size());

			System.out.print(list.get(index));
		}
	}

}
