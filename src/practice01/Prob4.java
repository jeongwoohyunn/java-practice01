package practice01;

import java.util.Scanner;

public class Prob4 {

	public static void main(String[] args) {
		System.out.print("문자열을 입력하세요. : ");
		String message;
		String a = new String();
		Scanner scanner = new Scanner(System.in);
		message = scanner.nextLine();//nextint,nextline
		for (int j = 0; j < message.length(); j++) {
			a+=message.charAt(j);//문자하나씩 뽑아오기 변수.charAt
			System.out.println(a);
		}

	}

}
