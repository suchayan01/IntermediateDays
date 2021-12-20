package Day9;

import java.util.Arrays;

public class rangeSum {
    public static long[] rangeSum(int[] A, int[][] B) {
        int [] ps= new int [A.length];
        long [] res= new long [B.length];
        int sum=0;
        for(int i=0;i<A.length;i++){
            sum+=A[i];
            ps[i]=sum;
        }
        System.out.println(Arrays.toString(ps));
        int index=0;
        for(int [] rows :B){
            sum =0;
            
            //for (int j: rows){
                int start = rows[0];
                int end = rows[1];
                
                
                if(start>1){
                	System.out.println(ps[end-1]);
                	System.out.println(ps[start-2]);
                    sum=ps[end-1]-ps[start-2];
                }
                else{
                	System.out.println("----");
                    sum=ps[end-1];
                }
                res[index]=sum;
                index++;

            //}
        }
    return res;
    }
    
    public static void main(String[] args) {
    	int [] A = new int [] { 7};
    		int [][] B =new int [][]{
    			
//    			  {7, 10},
//    			  {3, 10},
//    			  {3, 5},
    			  {1,1}
    			};
    			System.out.println(Math.pow(2, 3));
    		System.out.println(Arrays.toString(rangeSum(A,B)));
	}
}
