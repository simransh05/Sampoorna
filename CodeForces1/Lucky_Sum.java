package CodeForces1;

import java.util.Scanner;

public class Lucky_Sum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long l = sc.nextLong();
		long r = sc.nextLong();
		long x = 4;
		long sum = 0;
		long prev = l;
		long fl = -1;
		boolean found = false;
		while (x <= r) {
			if (x >= l) {
				sum += (x - prev) * x;
				if (fl == -1) {
					fl = x;
				}
			}
			int y = 0;
			int count = 0;
			while (x > 0) {
				if (!found) {
					if ((x % 10) == 7) {
						y += Math.pow(10, count) * 4;
					} else {
						y += Math.pow(10, count) * 7;
					}
				} else {
					y += Math.pow(10, count) * (x % 10);
					found = true;
				}
				x /= 10;
				count++;
			}
			if (!found) {
				x += Math.pow(10, count) * 4;
			}
			x = y;
		}
		sum += (r - prev) * x;
		System.out.println(sum + fl);
		sc.close();

	}

}
