package Day14;

public class Problem1 {
	public static  String addBinary(String A, String B) {
		String res="";
		int A_decimal=Integer.parseInt(A,2);
		int B_decimal = Integer.parseInt(B,2);
		int res_decimal= A_decimal+B_decimal;
		System.out.println(res_decimal);
		
		
		  while(res_decimal>0) {
		  
		  res = String.valueOf(res_decimal%2) + res;
		  System.out.println(res); 
		  res_decimal/=2;
		  
		  }
		 
		
		return res;
    }
	
	public static void main(String[] args) {
		String A= "10001100010111000101100010100110001001101010000010011010";
		String	B = "101111000100100100111110010010101110101001100100101001111010011000000110";
		System.out.println(addBinary(A, B));
		
	}

}
