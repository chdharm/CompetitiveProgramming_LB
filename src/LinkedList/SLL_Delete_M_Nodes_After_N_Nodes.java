package LinkedList;

import java.util.Scanner;

public class SLL_Delete_M_Nodes_After_N_Nodes {
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
	
	public static SLL.Node removingNodes(SLL.Node LL,int after,int total){
		SLL.Node temp=LL;
		int count=1;
		int count2=0;
		while(temp!=null){
			if(count<after){
				temp=temp.next;
				count++;
			}
			else if(count2==total){
				return LL;
			}else{
				temp.next=temp.next.next;
				count2++;
			}
		}
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
		System.out.println("\n After Removing Nodes:");
		removingNodes(ll.head,5,3);
		//gemoveDuplicates_Recursive(ll.head);
		printSLL(ll.head);
		
	}
}
