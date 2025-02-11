package Session3;

import java.util.Scanner;

public class Rope {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k= sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		double moe= 1e-7;
		double ans = 0;
		double s =0;
		double e = 1e7;
		int numIteration =50;
		for(int i=0;i<=numIteration;i++) {
			double mid =s+(e-s)/2;
			// can we take out k pieces of size m from n ropes
			if(canMake(n,k,arr,mid)) {
				ans = mid;
				s=mid+moe;
			}else {
				e= mid-moe;// margin of error
			}
		}System.out.println(String.format("%.6f", ans));
	}

	private static boolean canMake(int n, int k, int[] arr, double mid) {
		int count =0;
		for(int i=0;i<arr.length;i++) {
			count+=arr[i]/mid;
		}
		return count>=k;
	}

}
