package Day8;

import java.util.Arrays;
import java.util.HashMap;

public class check {
	public static HashMap counter(String val) {
		HashMap<String, Integer>map= new HashMap<>();
		
		for(String i:val.split(" ")) {
			map.put(i,i.length());
		}
		return map;
	}
	public static Object[] counter_exact(String val) {
		int arr_length= val.split(" ").length;
		Object [] arr= new Object [arr_length];
		
		int index=0;
		for(String i:val.split(" ")) {
			//if((int)i>=65 && (int)i<=97) {
			arr[index]= i + " : "+i.length();
			index++;
//			}
		}
		return arr;
	}
	public static void main(String[] args) {
		String A= "I will move to US and be doing MS in 2021";
		String B = "He is in the room . is he busy?";
		System.out.println(Arrays.toString(counter_exact(B)));
		System.out.println(counter(B));
	}

}
