package practice01;

public class Prob5 {

	public static void main(String[] args) {
		for (int i = 1; i <= 99; i++) {
			int a = i % 10;
			int b = i / 10;
			if (i < 10) {
				if (a % 3 == 0)
					System.out.println(i + " 짝");
			}
			else {
				if (a % 3 == 0 || b % 3 == 0 || b == 0)
					System.out.println(i + " 짝");
			}
		}
	}
}
