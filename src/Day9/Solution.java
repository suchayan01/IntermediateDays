package Day9;

import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
    public ArrayList<ArrayList<Integer>> solve(ArrayList<Integer> a, ArrayList<Integer> b) {
        ArrayList< ArrayList<Integer> > ans = new ArrayList<>();
        int n = a.size();
        for(int x : b) {
            ArrayList<Integer> temp = new ArrayList<>();
            for(int i = 0; i < n; i++)  {
            	temp.add(a.get( (i+x) % n ));
            	System.out.print((i+x) % n);
            	System.out.println(temp);
            }
            ans.add(temp);
        }
        return ans;
    }
    
    public static void main(String [] args) {
    	Solution s= new Solution();
    	//int [] A = { 6, 31, 33, 13, 82, 66, 9, 12, 69, 21, 17, 2, 50, 69, 90, 71, 31, 1, 13, 70, 94, 46, 89, 13, 55, 54, 67, 97, 28, 27, 62, 34, 41, 18, 15, 35, 13, 84, 93, 27, 89, 23, 6, 56, 94, 40, 54, 95, 47 };
    	//int [] B = { 88, 85, 98, 36, 66, 40, 30, 26, 51, 77, 62, 60, 92, 64, 53, 86, 24, 53, 85, 49, 57, 29, 32, 60, 75, 82, 17, 23, 67, 51, 23, 11, 70, 59 };
    	ArrayList<Integer> A=new ArrayList<>();
    	ArrayList<Integer> B=new ArrayList<>();
    	A.add(1);
    	A.add(2);
    	A.add(3);
    	A.add(4);
    	A.add(5);
    	B.add(2);
    	for(ArrayList<Integer>a:s.solve(A, B)) {
    		System.out.println(a);
    	}
    }
}
