package LinkedList;
import java.util.*;
public class SLL_Find_Nth_Element {
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
	//Iterative Solution (1,2,3,4,5,6,7,8,9,10)
	public static int Data_at_Index_Iterative(SLL.Node LL, int index){
		int count=0;
		SLL.Node temp=LL;
		while(count<index){
			count++;
			temp=temp.next;
		}
		return temp.data;
	}
	//Recursive Solution (1,2,3,4,5,6,7,8,9,10)
//	public static int Data_at_Index_Recursive(SLL.Node LL, int index){
//		We can take a global variable to store the current index
//	}
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
		System.out.println(Data_at_Index_Iterative(ll.head,5));
		
	}
}
