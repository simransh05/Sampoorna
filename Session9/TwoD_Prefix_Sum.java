package Session9;

import java.util.Scanner;

public class TwoD_Prefix_Sum {

	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		int q= sc.nextInt();
		int[][]arr = new int[m][n];
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		int [][] prefix =new int[m][n];
		

	}

}
