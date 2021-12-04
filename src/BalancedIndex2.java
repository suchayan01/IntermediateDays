// TC= O(N) sc= O(1)

public class BalancedIndex2 {
	public static void main(String[] args) {
		int arr[]= new int[] {-7,1,5,2,-4,3,0};
		int sl=0,sr=0;
		for(int i:arr) {
			sr+=i;
		}
		
		for(int i=0;i<arr.length;i++) {
			if(i==0) {
				sl=0;
				sr-=arr[i];
			}
			else {
				sl+=arr[i-1];
				sr-=arr[i];
				
			}
			if(sr==sl) {
				System.out.println(arr[i]+"---- index number"+" "+i);
			}
			
		}
	}
}
