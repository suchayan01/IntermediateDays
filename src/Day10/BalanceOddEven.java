package Day10;

import java.util.Arrays;

public class BalanceOddEven {
    public static int solve(int[] A) {
        int ps[]= new int [A.length];
        int pe[]=new int[A.length];
        int po[]= new int[A.length];
        int sum=0,index=0,sum_e=0,sum_o=0;
        for(int i=0;i<A.length;i++){
            sum+=A[i];
            ps[index]=sum;
            index++;
            if(i%2==0){
                sum_e+=A[i];
                
            }
            else{
                sum_o+=A[i];
                
            }
            pe[i]=sum_e;
            po[i]=sum_o;
        }
        System.out.println(Arrays.toString(pe));
        System.out.println(Arrays.toString(po));
        int sl=0,sr=0;
        for(int i=0;i<A.length;i++){
            if(i==0){
                sl=0;
            }
            
            else{
                sl=ps[i-1];
            }
            if(i%2==0){
                sr=po[A.length-1]+pe[i-1] -po[i+1];
            }
            else{
                sr=pe[A.length-1]+po[i-1]-pe[i+1];
            }

            if(sl==sr){
                return i;
            }
        }
        return -1;
    }
    
    public static void main(String[] args) {
    	int [] A=  new int[] {2, 1, 6, 4};
		System.out.println(solve(A));
	}
}
