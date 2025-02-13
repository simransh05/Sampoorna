package Session4;

import java.util.Scanner;

public class Book {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[7];
		for(int i=0;i<7;i++) {
			arr[i]=sc.nextInt();
		}
		
		int count=0;
		while(n>0) {
			n-=arr[count];
			count++;
			count%=7;
		}
		if(count==0) {
			System.out.println(7);
		}else {
			System.out.println(count);
		}

	}

}
