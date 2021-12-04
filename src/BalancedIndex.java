import java.util.Arrays;

public class BalancedIndex {
	public static void main(String[] args) {
		int arr[]= new int[] {-7,1,5,2,-4,3,0};
		int sl=0,sr=0;
		int ps[]= new int [arr.length];
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
			ps[i]=sum;
		}
//		System.out.println(Arrays.toString(ps));
		System.out.println(Arrays.toString(arr));
		for(int i=0;i<arr.length;i++) {
			if(i==0) {
				sl=0;
			}
			else {
			sl=ps[i-1];
			}
			if(i<arr.length-1) {
			sr=ps[ps.length-1]-ps[i];
			}
			else {
				sr=0;
			}
			if(sl==sr) {
				System.out.println(arr[i]+"---- index number"+" "+i);
				break;
			}
			/*else {
				if(i==3) {
					System.out.println(sl);
					System.out.println(sr);
				}
			}*/
		}
	}
}
