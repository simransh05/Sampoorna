package Session1;

import java.util.Scanner;
public class Sereja_And_Dima{
    public static void main (String[]args){
    	Scanner  sc= new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }sum(arr,0,arr.length-1);
            sc.close();
        }
    public static void sum(int[]arr,int i,int j){
        int Spoint=0;int Dpoint=0;
        boolean Sturn=true;
        while(i<=j){
            if(arr[i]>arr[j]){
                if(Sturn){
                  Spoint+=arr[i];
                }else{
                    Dpoint+=arr[i];
                }
                i++;
            }
        else{
            if(Sturn){
                Spoint+=arr[j];
            }else{
                Dpoint+=arr[j];
            }
            j--;
        }
        Sturn=!Sturn;
        }
        System.out.println(Spoint+" "+Dpoint);
    }
}