package Day10;

import java.util.Arrays;

public class Rotaten {
    public int[][] solve(int[] A, int[] B) {
        int[][]res= new int[B.length][A.length];
        
        int tmp[];
                for(int j:B){
                	tmp=A.clone();
                    tmp=rotating(tmp,0,tmp.length-1);
//                    System.out.println(Arrays.toString(A));
//                    System.out.println(Arrays.toString(tmp));
                    tmp=rotating(tmp,0,j%A.length-1);
                    //tmp=rotating(tmp,j%A.length,tmp.length-1);
                    //System.out.println(Arrays.toString(tmp));
//                    System.out.println("----------" + j);
                    
                }
            //}
        //}
        return res;
    }

    int[] rotating(int []arr ,int start_index, int lst_index) {
		int i=start_index,j=lst_index;
		while(i<j) {
			arr[i]+=arr[j];
			arr[j]=arr[i]-arr[j];
			arr[i]-=arr[j];
			i++;
			j--;
		}
		return arr;
	}
    public static void main(String[] args) {
    	
		Rotaten r= new Rotaten();
		int A[]=new int[] {6, 31, 33, 13, 82, 66, 9, 12, 69, 21, 17, 2, 50, 69, 90, 71, 31, 1, 13, 70, 94, 46, 89, 13, 55, 54, 67, 97, 28, 27, 62, 34, 41, 18, 15, 35, 13, 84, 93, 27, 89, 23, 6, 56, 94, 40, 54, 95, 47};
				int B[]=new int[] {88, 85, 98, 36, 66, 40, 30, 26, 51, 77, 62, 60, 92, 64, 53, 86, 24, 53, 85, 49, 57, 29, 32, 60, 75, 82, 17, 23, 67, 51, 23, 11, 70, 59};
		System.out.println(Arrays.deepToString(r.solve(A, B)));
	}
}

