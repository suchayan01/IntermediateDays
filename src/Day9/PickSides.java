package Day9;

import java.util.Arrays;

public class PickSides {
    public static int solve(int[] A, int B) {
       
        int [] ps= new int [A.length];
        ps[0]=A[0];
       for(int i=1;i<A.length;i++){
           ps[i]=A[i]+ps[i-1];

       }
       System.out.println(Arrays.toString(ps));
       System.out.println(ps[B-1]+A[A.length-1]);
       System.out.println(ps[0]+ps[A.length-1]-ps[A.length-B]);
       return Math.max(ps[B-1],ps[A.length-1]-ps[A.length-B-1]);
//       return Math.max(Math.max(ps[B-1],ps[A.length-1]-ps[A.length-B-1])
//       ,ps[0]+ps[A.length-1]-ps[A.length-B]);
    }
    
    public static void main(String[] args) {
//    	int [] A = {1, 2};
//    			 int B = 1;
    			 
    			 int [] A = { -533, -666, -500, 169, 724, 478, 358, -38, -536, 705, -855, 281, -173, 961, -509, -5, 942, -173, 436, -609, -396, 902, -847, -708, -618, 421, -284, 718, 895, 447, 726, -229, 538, 869, 912, 667, -701, 35, 894, -297, 811, 322, -667, 673, -336, 141, 711, -747, -132, 547, 644, -338, -243, -963, -141, -277, 741, 529, -222, -684, 35 };
    					int  B = 48;
    			 System.out.println(solve(A,B));
    			 
    			 int sum=0;
    			 for(int i=A.length-B;i<A.length;i++) {
    				 sum+=A[i];
    			 }
    			 System.out.println(sum);
    			 
	}
}
