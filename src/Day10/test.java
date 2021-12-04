package Day10;

import java.util.ArrayList;

import java.lang.*;
import java.util.*;

public class test {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner sc = new Scanner(System.in);
        int t_cases= sc.nextInt();
        while(t_cases>0){
            int arr_length= sc.nextInt();
            int arr[]= new int[arr_length];
            int index=0;
            while(index<arr_length){
                arr[index]=sc.nextInt();
                index++;
            }
            ArrayList<Integer> a_even= new ArrayList<>();
            ArrayList<Integer> a_odd= new ArrayList<>();
            for(int i:arr){
                if(i%2==0){
                    a_even.add(i);
                }
                else{
                    a_odd.add(i);
                }
//                System.out.println(a_even);
//                System.out.println(a_odd);
            }
            for(int i:a_even){
                System.out.print(i+" ");
            }
            System.out.println("---------");
            for(int i:a_odd){
                System.out.print(i+" ");
            }
            t_cases--;
        }
        
    }
}
