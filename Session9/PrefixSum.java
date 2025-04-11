package Session9;

import java.util.Scanner;

public class PrefixSum {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int q = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int[] prefix = new int[n + 1];
		prefix[0] = 0;
		for (int i = 1; i < n + 1; i++) {
			prefix[i] = prefix[i - 1] + arr[i - 1];
		}
		while (q-- > 0) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			
		}
	}

}
