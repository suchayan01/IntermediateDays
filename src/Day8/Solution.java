package Day8;

import java.util.Arrays;

public class Solution {
    public int[][] solve(int[] A, int[] B) {
    	int [][]res= new int [B.length][A.length];
    	int row=0;
        for(int i:B){
        	int[] temp = A.clone();
        	if(i%A.length!=0) {
            swap(temp,0,A.length-1);
            System.out.println(Arrays.toString(temp));
            swap(temp,0,A.length-(i%A.length)-1);
            System.out.println(Arrays.toString(temp));
            swap(temp,A.length-(i%A.length),A.length-1);
            System.out.println(Arrays.toString(temp));
            
            //for(i=0;i<B.length;i++) {
           
        	}
            	for(int j=0;j<A.length;j++) {
            		res[row][j]= temp[j];
            	}
            	row++;
            
        }
        
        return res;
        
    }
    public int[] swap(int [] arr, int start, int last){
        int[] arr1= arr.clone();
        while(start<last){
            arr[start]^=arr[last];
            arr[last]^=arr[start];
            arr[start]^=arr[last];
            start++;
            last--;
        }
        return arr1;
    }
    public static void main(String [] args) {
    	Solution s= new Solution();
    	//int [] A = { 6, 31, 33, 13, 82, 66, 9, 12, 69, 21, 17, 2, 50, 69, 90, 71, 31, 1, 13, 70, 94, 46, 89, 13, 55, 54, 67, 97, 28, 27, 62, 34, 41, 18, 15, 35, 13, 84, 93, 27, 89, 23, 6, 56, 94, 40, 54, 95, 47 };
    	//int [] B = { 88, 85, 98, 36, 66, 40, 30, 26, 51, 77, 62, 60, 92, 64, 53, 86, 24, 53, 85, 49, 57, 29, 32, 60, 75, 82, 17, 23, 67, 51, 23, 11, 70, 59 };
    	int [] A = {1, 2, 3, 4, 5};
    		   int [] B = {2};
    	for(int [] a:s.solve(A, B)) {
    		System.out.println(Arrays.toString(a));
    	}
    }
}
