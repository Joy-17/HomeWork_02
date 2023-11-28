package hw4;

import java.util.Scanner;

public class HW_4 {
	public static void main(String[] args) {
		score();
	}

	// 1.請寫出一隻程式能輸出此陣列所有元素的平均值與大於平均值的元素
	public static void avg() {
		int[] a1 = { 29, 100, 39, 41, 50, 8, 66, 77, 95, 15 };

		int sum = 0;
		for (int i = 0; i < a1.length; i++) {
			sum += a1[i];
		}
		double avg = sum / a1.length;
		System.out.println("平均值為:" + avg);
		for (int i = 0; i < a1.length; i++) {
			if (a1[i] > avg) {
				System.out.print(a1[i] + "\t");
			}
		}
	}

	// 2.請建立一個字串,經過程式執行後,輸入結果是反過來的
	public static void reverseString() {
		String s = "Hello World";
		for (int i = s.length() - 1; i >= 0; i--) {
			char c = s.charAt(i);
			System.out.print(c + "");
		}
	}

	// 3.有個字串陣列如下 (八大行星):
	// {“mercury”, “venus”, “earth”, “mars”, “jupiter”, “saturn”, “uranus”,
	// “neptune”}
	// 請用程式計算出這陣列裡面共有多少個母音(a, e, i, o, u)
	public static void motherChar() {
		String[] s = { "mercury", "venus", "earth", "mars", "jupiter", "saturn", "uranus", "neptune" };
		int count = 0;
		for (int i = 0; i < s.length; i++) {
			for (int j = 0; j < s[i].length(); j++) {
				char c = s[i].charAt(j);
				if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
					count++;
				}
			}
		}
		System.out.println("總共有" + count + "個母音");
	}

	// 4.阿文上班時忘了帶錢包,想要向同事借錢
	public static void borrowMoney() {
		int[][] coWorker = { { 25, 32, 8, 19, 27 }, { 2500, 800, 500, 1000, 1200 } };
		Scanner sc = new Scanner(System.in);
		int money, input;
		System.out.println("請輸入欲借金額:");
		while (true) {
			input = sc.nextInt();
			if (input <= 0) {
				System.out.println("請輸入正整數");
			} else {
				money = input;
				break;
			}
		}

		int count = 0;
		System.out.println("員工編號:");
		for (int i = 0; i < coWorker[1].length; i++) {
			if (coWorker[1][i] >= money) {
				count++;
				System.out.print(coWorker[0][i] + ", ");
			}
		}
		System.out.print("共" + count + "人!");

	}

	// 5.請設計由鍵盤輸入三個整數，分別代表西元yyyy年,mm月,dd日，
	// 執行後會顯示是該年的第幾天。
	public static void getDayOfYear() {
		Scanner sc = new Scanner(System.in);

		int[] leapYear = { 0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		int[] normalYear = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		int dayOfYear = 0;
		int year, month, day;
		while (true) {
			System.out.println("請輸入年:");
			year = sc.nextInt();
			System.out.println("請輸入月:");
			month = sc.nextInt();
			System.out.println("請輸入日:");
			day = sc.nextInt();

			if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0) || (year % 1000 == 0)) {
				normalYear[2] = normalYear[2] + 1;
			}
			if (day <= 0 || day > normalYear[month]) {
				System.out.println("請輸入正確的日期");
				continue;
			} else {
				break;
			}
		}
		for (int i = 0; i < month; i++) {
			dayOfYear += normalYear[i];
		}
		dayOfYear = dayOfYear + day;
		System.out.println("輸入的該日期為該年第" + dayOfYear + "天");

	}

	public static void score() {

		int[] t1 = { 10, 35, 40, 100, 90, 85, 75, 70 };
		int[] t2 = { 37, 75, 77, 89, 64, 75, 70, 95 };
		int[] t3 = { 100, 70, 79, 90, 75, 70, 79, 90 };
		int[] t4 = { 77, 95, 70, 89, 60, 75, 85, 89 };
		int[] t5 = { 98, 70, 89, 90, 75, 90, 89, 90 };
		int[] t6 = { 90, 80, 100, 75, 50, 20, 99, 75 };

		int[][] score = { t1, t2, t3, t4, t5, t6 };
		int[] count = new int[8];
		for (int i = 0; i < score.length; i++) {
			int max = score[i][0];
			for (int j = 0; j < score[i].length; j++) {
				if (max < score[i][j]) {
					max = score[i][j];
				}
			}
			for (int k = 0; k < score[i].length; k++) {
				if (max == score[i][k]) {
					count[k] = count[k] + 1;
				}
			}
		}

		for (int i = 0; i < count.length; i++) {
			System.out.println((i + 1) + "號考最高分的次數" + count[i]);
		}
		// 4,8,1,2,1,3
	}
}
