package hw5;

import java.util.Random;

public class HW5_2 {
	public static void main(String[] args) {
		// 2.randAvg
		randAvg();

	}

	public static void randAvg() {
		Random r = new Random();
		System.out.println("本次亂數結果：");
		int count = 0;
		for (int i = 0; i < 10; i++) {
			int random = (int) (Math.random() * 101);
			System.out.print(random + " ");
			count += random;
		}
		int avg = count / 10;
		System.out.println();
		System.out.println(avg);

	}

}
