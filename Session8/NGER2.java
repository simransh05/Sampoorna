package Session8;

import java.util.Arrays;
import java.util.Stack;

public class NGER2 {
	public static int[] next(int[] arr) {
		Stack<Integer> stk1 = new Stack<>();
		Stack<Integer> stk2 = new Stack<>();
		Stack<Integer> temp = new Stack<>();
		int[] ans = new int[arr.length];
		Arrays.fill(ans, -1);
		for (int i = 0; i < arr.length; i++) {
			while (!stk2.isEmpty() && arr[i] > arr[stk2.peek()]) {
				ans[stk2.peek()] = arr[i];
				stk2.pop();
			}
			while (!stk1.isEmpty() && arr[i] > arr[stk1.peek()]) {
				temp.push(stk1.peek());
				stk1.pop();
			}
			while (!temp.isEmpty()) {
				stk2.push(temp.peek());
				temp.pop();
			}
			stk1.push(i);
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
