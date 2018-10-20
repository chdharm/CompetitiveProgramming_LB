package LinkedList;
import java.util.*;
public class SLL_Length_Interative_and_Recursive {
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
	//Recursive Solution
	public static int SLL_Length_Recursive(SLL.Node LL){
		if(LL==null){
			return 0;
		}
		return 1+SLL_Length_Recursive(LL.next);
	}
	//Iterative Solution
	public static int SLL_Length_Iterative(SLL.Node LL){
		int count=0;
		SLL.Node temp=LL;
		while(temp!=null){
			count++;
			temp=temp.next;
		}
		return count;
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
		//System.out.println("\n Before Deleting Node: "+SLL_Length_Iterative(ll.head));
		System.out.println("\n Before Deleting Node: "+SLL_Length_Recursive(ll.head));
		ll.head=deleteFromLast(ll.head);
		System.out.println("\nAfter Deleting Last Node: ");
		//System.out.println(SLL_Length_Iterative(ll.head));
		System.out.println(SLL_Length_Recursive(ll.head));
	}
}
