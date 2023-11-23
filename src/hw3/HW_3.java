package hw3;

import java.util.Scanner;

public class HW_3 {
	public static void main(String[] args) {
		numberHate();

	}

	public static void isTriangle() {

		// 1.使用者輸入整數
		Scanner sc = new Scanner(System.in);
		System.out.println("請輸入三個正整數：");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		
		
		// 2.三角形判斷
		if (a + b <= c || b + c < a || a + c <= b) {
			System.out.println("不是三角形");
			return;
		} else if (a == b && b == c) {
			System.out.println("正三角形");
			return;
		} else if (a == b || b == c || a == c) {
			System.out.println("等腰三角形");
		} else if ((a * a == b * b + c * c) || (b * b == a * a + c * c) || (c * c == a * a + b * b)) {
			System.out.println("直角三角形");
		} else {
			System.out.println("其他三角形");
		}

		// 3.直角三角形判斷
		int a2 = a * a;
		int b2 = b * b;
		int c2 = c * c;

		if ((a2 + b2 == c2) || (a2 + c2 == b2) || (b2 + c2 == a2)) {
			System.out.print("且為直角三角形");
		} else if ((a2 + b2 < c2) || (a2 + c2 < b2) || (b2 + c2 < a2)) {
			System.out.print("且為鈍角三角形");
		} else {
			System.out.print("且為銳角三角形");
		}
	}

	public static void numberGuess() {
		int number = (int) (Math.random() * 10);
		System.out.println(number);

		Scanner sc = new Scanner(System.in);

		System.out.println("開始猜數字吧！（0~9）");
		while (true) {
			int guess = sc.nextInt();
			if (number == guess) {
				System.out.println("答對了！答案就是" + number);
				break;
			} else {
				System.out.println("猜錯囉");
			}
		}
	}

	public static void numberGuess100() {
		int number = (int) (Math.random() * 101);
		Scanner sc = new Scanner(System.in);
		System.out.println("請輸入數字");
		int guess;
		while (true) {
			int input = sc.nextInt();
			if (input < 0 || input > 100) {
				System.out.println("請輸入0~100的數字");
			} else {
				guess = input;
				break;
			}
		}

		while (true) {
			if (number == guess) {
				System.out.println("答對了！答案就是" + number);
				return;
			} else if (number < guess) {
				System.out.println("猜錯囉答案再小一點");
				continue;
			} else if (number > guess) {
				System.out.println("猜錯囉答案再大一點");
				continue;
			}
		}
	}

	public static void numberHate() {
		Scanner sc = new Scanner(System.in);
		System.out.println("阿文...請輸入你討厭哪個數字？");
		int hate;
		while (true) {
			int input = sc.nextInt();
			if (input < 1 || input > 9) {
				System.out.println("請輸入1~9");
			} else {
				hate = input;
				break;
			}
		}

		int count = 0;
		for (int i = 1; i <= 49; i++) {
			int tens = i / 10;
			int units = i % 10;
			if (tens != hate && units != hate) {
				count++;
				System.out.print(i + "\t");
				if (count % 6 == 0) {
					System.out.println();
				}
			}
		}
		System.out.println();
		System.out.println("總共有" + count + "個數字可選");
	}

	public static void numberHateRandom() {

	}
}
