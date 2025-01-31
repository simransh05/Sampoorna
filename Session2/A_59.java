package Session2;

import java.util.Scanner;

public class A_59 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		String s = sc.next();
		int upper =0; int lower = 0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)>='a') {
				lower++;
			}else {
				upper++;
			}
		}if(lower>=upper) {
			System.out.println(s.toLowerCase());  
		}else {
			System.out.println(s.toUpperCase());  
		}

	}

}
