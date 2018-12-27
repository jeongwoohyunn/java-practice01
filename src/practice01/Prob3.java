package practice01;

import java.util.Scanner;

public class Prob3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("숫자를 입력하세요 : ");
		int input = scanner.nextInt();
		int a = 0;
		for (int j = 1; j <=input; j++) {
			if (input % 2 == 0) {
				if (j % 2 == 0)
					a += j;
			} else {
				if (j % 2 != 0)
					a += j;
			}
		}
		System.out.println("결과 값 : " + a);
	}
}

