package LinkedList;
import java.util.*;
import java.util.Scanner;

public class SLL_Find_Middle_Element {
	public static SLL.Node InsertionAtLast(SLL.Node LL,int data){
		SLL.Node NTBA=new SLL.Node(data);
		SLL.Node temp=LL;
		while(temp.next!=null){
			temp=temp.next;
		}
		temp.next=NTBA;
		return LL;
	}
	public static SLL.Node printSLL(SLL.Node LL){
		SLL.Node temp=LL;
		while(temp!=null){
			System.out.print(temp.data+"--->");
			temp=temp.next;
		}
		return LL;
	}
	public static SLL.Node deleteFromLast(SLL.Node LL){
		SLL.Node temp=LL;
		while(temp.next.next!=null){
			temp=temp.next;
		}
		temp.next=null;
		return LL;
	}
	//Using Length of LinkedList in Solution
	public static int middleElemet_Length(SLL.Node LL,int n){
		//We will first traverse over the list to get the length 
		//after that we will traverse again till length/2 elements
		return 0;
	}
	//Using two pointers in Solution
	public static int middleElemet_Two_Pointer(SLL.Node LL){
		SLL.Node first=LL;
		SLL.Node second=LL;
		while(first!=null && first.next!=null){
			first=first.next.next;
			second=second.next;
		}
		return second.data;
	}
	public static void main(String [] args){
		Scanner scan=new Scanner(System.in);
		SLL ll=new SLL();
		ll.head=new SLL.Node(scan.nextInt());
		while(scan.hasNextInt()){
			int newNode=scan.nextInt();
			if(newNode==-1){
				break;
			}
			ll.head=InsertionAtLast(ll.head,newNode);
		}
		printSLL(ll.head);
		System.out.println();
		System.out.println(middleElemet_Two_Pointer(ll.head));
		
	}
}
