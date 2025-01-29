package Session1;

import java.util.Scanner;

public class C_599 {
	public static int day(int[] nums) {
		int [] right = new int[nums.length];
        right[right.length-1]=nums[nums.length-1];
        for(int i=nums.length-2;i>=0;i--){
            right[i]=Math.min(right[i+1],nums[i]);
        }int leftMax  = nums[0];
        int c =0;
        for(int i=0;i<nums.length-1;i++){
            leftMax= Math.max(leftMax,nums[i]);
            if(leftMax<=right[i+1]){
                c++;
            }
        }
        return c+1;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i]= sc.nextInt();
		}
		System.out.println(day(arr));

	}

}
