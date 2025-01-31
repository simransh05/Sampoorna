package Session2;

import java.util.Scanner;

public class A_281 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		if(s.length()>0) {
			String str = Character.toUpperCase(s.charAt(0))+s.substring(1);
			System.out.println(str);
		}

	}

}
