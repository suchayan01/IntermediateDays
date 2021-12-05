
package Day10;
public class Balancedindex {
    public int solve(int[] A) {
        int ps[]= new int [A.length];
        int sum=0, sl=0, sr=0 ;
        for(int i=0;i<A.length;i++){
           sum+=A[i];
           ps[i]=sum;
        }
        for(int i=0;i<A.length;i++){
            if(i==0){
                sl=0;
            }
            
            else{
                sl=ps[i-1]; 
            }
            sr=ps[A.length-1]-ps[i];
            if(sl==sr){
                return i;
            }
        }
        return -1;
    }
}
