package Session4;

import java.util.Scanner;

public class Effective {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [] map = new int[n+1];
		for(int i=0;i<n;i++) {
			int x = sc.nextInt();
			map[x]=i+1;
		}long sum1 =0; long sum2=0;
		int m = sc.nextInt();
		while(m>0) {
			int val = sc.nextInt();
			sum1+=map[val];
			sum2+=(n-map[val]+1);
			m--;
		}
		System.out.println(sum1+" "+sum2);
	}

}
