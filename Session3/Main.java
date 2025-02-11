package Session3;

import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long  w =sc.nextInt();
        long h= sc.nextInt();
        long n = sc.nextInt();
        long ans=0;
        long si = Math.max(w,h);
        long ei = Math.max(w,h)*n;
        while(si<=ei){
            long mid = si+(ei-si)/2;
            // can i pack n rectangle of dimension with a sqaure of dimension m*m;
            if(fun(w,h,n,mid)){
                ans = mid;
                ei= mid-1;
            }else{
                si = mid+1;
            }
        }System.out.println(ans);
    }
    public static boolean fun(long w,long h ,long n ,long m){
        long row = m/h;
        long col = m/w;
        return col>0 && row >=(n+(col-1))/col ;
    }
}