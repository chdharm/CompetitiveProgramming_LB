package Stack;
import java.util.Scanner;
public class NextGreaterElement_LB {
	public static void main(String [] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Array before replacing with NGE");
		for(int i=0;i<n;i++) {
			System.out.println(arr[i]);
		}
		arr=replaceWithNGE(arr,n);
		System.out.println("Array before replacing with NGE");
		for(int i=0;i<n;i++) {
			System.out.println(arr[i]);
		}
	}
	public static int[] replaceWithNGE(int [] arr, int n) {
		         
	}
}
