package Session2;

import java.util.Scanner;

public class A_266 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		String s = sc.next();
		int count=0;
		for(int i=1;i<s.length();i++) {
			if(s.charAt(i)==s.charAt(i-1)) {
				count++;
			}
		}System.out.println(count);

	}

}
