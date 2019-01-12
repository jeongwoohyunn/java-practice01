package practice01;

import java.util.Scanner;

public class Prob3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < 3; i++) {
			System.out.print("숫자를 입력하세요 : ");
			int a = 0;
			int input = scanner.nextInt();

			for (int j = 1; j <= input; j++) {
				if (input % 2 == 0) {
					if (j % 2 == 0)
						a += j;
				} else {
					if (j % 2 != 0)
						a += j;
				}
			}
			System.out.println("결과 값 : " + a+"\n");
		}
	}
}
