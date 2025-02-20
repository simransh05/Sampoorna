package Session5;

public class Sliding_Window {
	public static int Maximum(int[] arr, int k) {
		int sum = 0;int si=0;int ei =0;
		int ans=Integer.MIN_VALUE;
		while(ei<k) {
			sum+=arr[ei];
			ei++;
		}ans = sum;
		while(ei<arr.length) {
			sum-=arr[si];
			si++;
			sum+=arr[ei];
			ans = Math.max(sum, ans);
			ei++;
		}return ans;
	}

	public static void main(String[] args) {
		int[] arr = {1,4,2,7,6,3,5};
		int k =4;
		System.out.println(Maximum(arr,k));
	}

}
