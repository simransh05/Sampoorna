package CodeForces;

import java.util.Scanner;

public class A_381 {
	public static void sum(int[] arr , int i, int j) {
		int s=0; int d=0;boolean sTurn=true;
		 while (i <= j) {
	            if (arr[i] > arr[j]) {
	                if (sTurn) {
	                    s += arr[i];
	                } else {
	                    d += arr[i];
	                }
	                i++;
	            } else {
	                if (sTurn) {
	                    s += arr[j];
	                } else {
	                    d += arr[j];
	                }
	                j--;
	            }
	            sTurn = !sTurn;
	        }
	        System.out.println(s + " " + d);
	    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			 arr[i]= sc.nextInt();
		}sum(arr,0,arr.length-1);

	}

}
