package hw2;

public class HW_2 {

	public static void main(String[] args) {
		// 1.請設計一隻Java程式,計算1~1000的偶數和 (2+4+6+8+...+1000)
		int sum = 0;
		for (int i = 1; i <= 1000; i++) {
			if (i % 2 == 0) {
				sum += i;
			}
		}
		System.out.println("1~1000的偶數和="+sum);
		System.out.println("----------------------------------------");

		// 2.請設計一隻Java程式,計算1~10的連乘積 (1*2*3*...*10) (用for迴圈)
		int result2 = 1;
		for (int i = 1; i <= 10; i++) {
			result2 = result2 * i;
		}
		System.out.println("1~10的連乘積="+result2);
		System.out.println("----------------------------------------");

		// 3.請設計一隻Java程式,計算1~10的連乘積 (1*2*3*...*10) (用while迴圈)
		int mult = 1;
		int result3 = 1;
		while (mult <= 10) {
			result3 = result3 * mult;
			mult++;
		}
		System.out.println("1~10的連乘積="+result3);
		System.out.println("----------------------------------------");

		// 4.請設計一隻Java程式,輸出結果為以下:
		// 1 4 9 16 25 36 49 64 81 100
		for (int i = 1; i <= 10; i++) {
			System.out.print(i * i + " ");
		}
		System.out.println();
		System.out.println("----------------------------------------");

		// 5.阿文很熱衷大樂透 (1 ~ 49),
		// 但他不喜歡有4的數字,不論是個位數或是十位數。
		// 請設計一隻程式,
		// 輸出結果為阿文可以選擇的數字有哪些?總共有幾個?
		int count = 0;
		System.out.println("阿文可以選擇的數字有：");
		for (int i = 1; i < 50; i++) {
			int tens = i / 10;
			int units = i % 10;

			if (tens != 4 && units != 4) {
				System.out.print(i + " ");
				count++;
			}
		}
		System.out.println();
		System.out.println("總共有" + count + "個選擇");
		System.out.println("----------------------------------------");

		//6.請設計一隻Java程式,輸出結果為以下:
		/*
			1 2 3 4 5 6 7 8 9 10
			1 2 3 4 5 6 7 8 9
			1 2 3 4 5 6 7 8
			1 2 3 4 5 6 7
			1 2 3 4 5 6
			1 2 3 4 5
			1 2 3 4
			1 2 3
			1 2
			1
		 */
		for (int i = 10; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}

		
		System.out.println("----------------------------------------");
		//7.請設計一隻Java程式,輸出結果為以下:
		/*
			A
			BB
			CCC
			DDDD
			EEEEE
			FFFFFF
		 */
		
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j <= i; j++) {
				char result4 = (char)('A'+i);
				System.out.print(result4);
			}
			System.out.println();
		}
		
		
		System.out.println("----------------------------------------");
		//8.九九乘法表
		
		//8.1 for + while
		System.out.println("for + while九九乘法表：");
		for (int i = 1; i <= 9; i++) {
			int j = 1;
			while (j <= 9) {
				System.out.print(i + "*" + j + "=" + i * j + "\t");
				j++;
			}
			System.out.println();
		}
		System.out.println("----------------------------------------");
		//8.2 for + do while
		System.out.println("for + do while九九乘法表：");
		for(int i =1;i<=9;i++) {
			int j = 1;
			do {
				System.out.print(i+"*"+j+"="+i*j+"\t");
				j++;
			}while(j<=9); 
			System.out.println();
		}
		
		System.out.println("----------------------------------------");
		//8.3 while + do while
		System.out.println("while + do while九九乘法表：");
		int i =1;
		while (i <= 9) {
			int j = 1;
			do {
				System.out.print(i + "*" + j + "=" + i * j + "\t");
				j++;
			} while (j <= 9);

			System.out.println();
			i++;
		}
	}

}
