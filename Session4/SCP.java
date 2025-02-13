package Session4;

import java.util.Scanner;

public class SCP {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int[] x= new int[n]; int[] y = new int[n];
		for(int i=0;i<x.length;i++) {
			x[i]= sc.nextInt();
			y[i]=sc.nextInt();
		}int scp =0;
		for(int i=0;i<n;i++) {
			int l=0;int r =0;int t=0;int b=0;
			for(int j=0;j<n;j++) {
				if(x[i]>x[j] && y[i]==y[j]) {
					r=1;
				}if(x[i]<x[j] && y[i]==y[j]) {
					l=1;
				}if(x[i]==x[j] && y[i]<y[j]) {
					t=1;
				}if(x[i]==x[j] && y[i]>y[j]) {
					b=1;
				}
			}if(t==1&& l==1 && r==1&& b==1) {
				scp++;
			}
		}
		System.out.println(scp);

	}

}
