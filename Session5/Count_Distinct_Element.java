package Session5;

import java.util.HashMap;

public class Count_Distinct_Element {
	public static int[] countDis(int[]arr, int k) {
		HashMap<Integer,Integer> map= new HashMap<>();
		int si=0;int ei=0;int freq=0;int[] arr1 = new int[arr.length-k+1];
		while(ei<k) {
			map.put(arr[ei], map.getOrDefault(arr[ei], 0)+1);
			ei++;
		}arr[freq++]=map.size();
		while(k<arr.length) {
			map.put(arr[si],map.get(arr[si])-1);
			if(map.get(arr[si])==0) {
				map.remove(arr[si]);
			}
			si++;
			map.put(arr[ei], map.getOrDefault(arr[ei], 0)+1);
			arr[freq++]=map.size();
			ei++;
		}return arr1;
	}

	public static void main(String[] args) {
		int[] arr= {1,2,1,3,1,4,6,4};
		int k =3;
		int[] arr1 = countDis(arr,k);
		for(int i=0;i<arr1.length;i++) {
			System.out.print(arr1[i]+"  ");
		}
	}

}
