package CodeForces;

import java.util.*;

public class A_271 {
	public static void distinct (int val) {
		val=val+1;
		while(true) {
		    String s = Integer.toString(val);
		    boolean available = true;
		    HashSet<Character> set = new HashSet<>();
		    for(char i :s.toCharArray()) {
			    if(set.contains(i)) {
				    available=false;
				    break;
			    }
			    set.add(i);
		    }
		    if(available) {
			    System.out.println(val);
			    break;
		    }val++;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		distinct(year);
	}

}
