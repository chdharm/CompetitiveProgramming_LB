package LinkedList;
import java.util.*;
public class SLL_Insertion {

	public static void main(String [] args){
		Scanner scan=new Scanner(System.in);
		SLL ll=new SLL();
		ll.head=new SLL.Node(scan.nextInt());
		while(scan.hasNextInt()){
			int newNode=scan.nextInt();
			if(newNode==-1){
				break;
			}
			ll.head=InsertionAtFront(ll.head,newNode);
		}
		printSLL(ll.head);
	}
	public static SLL.Node InsertionAtLast(SLL.Node LL,int data){
		SLL.Node NTBA=new SLL.Node(data);
		SLL.Node temp=LL;
		while(temp.next!=null){
			temp=temp.next;
		}
		temp.next=NTBA;
		return LL;
	}
	public static SLL.Node InsertionAtFront(SLL.Node LL,int data){
		SLL.Node newNode=new SLL.Node(data);
		newNode.next=LL;
		LL=newNode;
		return LL;
	}
	public static SLL.Node InsertionIntoMiddle(SLL.Node LL,int data,int position){
		SLL.Node newNode=new SLL.Node(data);
		SLL.Node temp=LL;
		int count=0;
		while(count<position-1){
			count++;
			temp=temp.next;
		}
		newNode.next=temp.next;
		temp.next=newNode;
		return LL;
	}
	public static void printSLL(SLL.Node LL){
		SLL.Node temp=LL;
		while(temp!=null){
			System.out.print(temp.data+"--->");
			temp=temp.next;
		}
	}
}
