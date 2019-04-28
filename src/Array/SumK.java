package Array;
import java.util.*;
public class SumK {

	public static void main(String [] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int sum=sc.nextInt();
		System.out.println(sumKInSortedArray(arr,sum));
	}
	public static boolean sumKInSortedArray(int [] arr, int sum) {
		int i=0,j=(arr.length)-1;
		boolean result=false;
		while(i<j) {
			int tempSum=arr[i]+arr[j];
			if(tempSum==sum) {
				result=true;
				break;
			}else if(tempSum<sum) {
				i++;
			}else {
				j--;
			}
		}
		return result;
	}
}
