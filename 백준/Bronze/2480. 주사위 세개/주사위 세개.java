import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = 0;
		int b = 0;
		int c = 0;

		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		int max = 0;
		int sum = 0;

		if (a == b && a == c && c == b) {
			max = a;
			System.out.println(10000 + (max * 1000));
		} else if (a == b || a == c) {
			sum = a;
			System.out.println(1000 + (sum * 100));
		} else if (b == c) {
			sum = b;
			System.out.println(1000 + (sum * 100));
		} else {
			if (a > b && a > c) {
				max = a;
				System.out.println((max * 100));
			} else if (b > a && b > c) {
				max = b;
				System.out.println((max * 100));
			} else if (c > a && c > b) {
				max = c;
				System.out.println((max * 100));

			}
		}

	}
}