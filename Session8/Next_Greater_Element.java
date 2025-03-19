package Session8;

import java.util.Stack;

public class Next_Greater_Element {
	public static int[] next(int[] arr) {
		int[] ans = new int[arr.length];
		Stack<Integer> stk = new Stack<>();
		for (int i = arr.length - 1; i >= 0; i--) {
			while(!stk.isEmpty() && stk.peek()<=arr[i]) {
				stk.pop();
			}if(stk.isEmpty()) {
				ans[i]=-1;
			}else {
				ans[i]=stk.peek();
			}stk.push(arr[i]);
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
