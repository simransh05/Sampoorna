package Session2;

import java.util.Scanner;

public class A_275 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][]arr = new int[3][3];
		int[][] ans = new int[3][3];
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				int toggle = arr[i][j];
				if(i-1>=0) {
					toggle+=arr[i-1][j];
				}
				if(j-1>=0) {
					toggle+=arr[i][j-1];
				}
				if(i+1<=2) {
					toggle+=arr[i+1][j];
				}
				if(j+1<=2) {
					toggle+=arr[i][j+1];
				}
				ans[i][j]=(toggle%2==0) ? 1 :0;
				System.out.print(ans[i][j]);
			}System.out.println();
		}
	}

}
