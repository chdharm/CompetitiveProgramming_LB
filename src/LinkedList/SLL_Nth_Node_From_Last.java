package LinkedList;
import java.util.*;
public class SLL_Nth_Node_From_Last {
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
	public static int getNodeValue_Length(SLL.Node LL,int n){
		//We will first traverse over the list to get the length 
		//after that we will traverse again till length-n elements
		return 0;
	}
	//Using two pointers in Solution
	public static int getNodeValue_Two_Pointer(SLL.Node LL,int n){
		SLL.Node first=LL;
		SLL.Node second=LL;
		while(n>0){
			//Setting starting position of first;
			n--;
			first=first.next;
		}
		while(first!=null){
			first=first.next;
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
		System.out.println(getNodeValue_Two_Pointer(ll.head,3));
		
	}
}
