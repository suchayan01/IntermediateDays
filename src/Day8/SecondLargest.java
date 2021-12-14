package Day8;

import java.lang.*;
import java.util.*;

public class SecondLargest {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner sc= new Scanner(System.in);
        int test = sc.nextInt();
        while(test>0){
            int arr_length= sc.nextInt(), index=0;
            int arr[]= new int [arr_length];
            while(index<arr_length){
                arr[index]=sc.nextInt();
                
                index++;
            }
            System.out.println(Arrays.toString(arr));
            int max_val=arr[0], second_lar=Integer.MIN_VALUE;
            int i=0;
            for(;i<arr.length;i++){
                max_val= max_val>arr[i]?max_val:arr[i];
            }
            i--;
            for(int j=0;j<arr.length;j++){
                if(j!=i){
                	System.out.println(i + "-----"+j);
                    second_lar= second_lar>arr[j]?second_lar:arr[j];
                }
            }
            second_lar=second_lar==Integer.MIN_VALUE?-1:second_lar;
            System.out.println(second_lar);
            test--;
        }
        
    }
}