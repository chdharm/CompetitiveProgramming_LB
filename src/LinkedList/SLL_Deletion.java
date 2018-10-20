package LinkedList;
import java.util.*;
public class SLL_Deletion {
	
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
	public static SLL.Node deleteFront(SLL.Node LL){
		LL=LL.next;
		return LL;
	}
	public static SLL.Node deleteMiddle(SLL.Node LL,int position){
		SLL.Node temp=LL;
		int count=0;
		while(count<position-1){
			count++;
			temp=temp.next;
		}
		temp.next=temp.next.next;
		return LL;
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
		ll.head=deleteMiddle(ll.head,5);
		System.out.println("\nAfter Deleting Last Node");
		printSLL(ll.head);
	}
}
