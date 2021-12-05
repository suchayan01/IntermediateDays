package Day10;

import java.util.Arrays;

public class rotateArray {
	public static void main(String[] args) {
		 int [] A =new int[] {5, 17, 100, 11};
		int [] B =new int[] {1};
		int[][]res= new int[B.length][A.length];
		System.out.println(Arrays.deepToString(res));
		int[]arr= new int [] {1, 2, 3, 4, 5};
		int rotate=2;
		arr=rotating(arr,arr.length);
		arr= rotating(arr,rotate);
		System.out.println(Arrays.toString(arr));
		
		
	}
	static int[] rotating(int []arr , int lst_index) {
		int i=0,j=lst_index-1;
		while(i<j) {
			arr[i]+=arr[j];
			arr[j]=arr[i]-arr[j];
			arr[i]-=arr[j];
			i++;
			j--;
		}
		
		
		return arr;
	}

}
