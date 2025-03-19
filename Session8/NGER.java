package Session8;

import java.util.Arrays;
import java.util.Stack;

public class NGER {
	public static int[] next(int[] arr) {
		int[] ans = new int[arr.length];
		Stack<Integer> stk = new Stack<>();
		Arrays.fill(ans, -1);
		for (int i = 0; i < arr.length; i++) {
			while (!stk.isEmpty() && arr[i] > arr[stk.peek()]) {
				ans[stk.peek()] = arr[i];
				stk.pop();
			}
			stk.push(i);
		}
		return ans;
	}

	public static void main(String[] args) {
		int[] arr = { 2, 3, 0, 1, 4, 6, 5 };
		int[] ans = next(arr);
		for (int i = 0; i < ans.length; i++) {
			System.out.print(ans[i] + "  ");
		}

	}

}
