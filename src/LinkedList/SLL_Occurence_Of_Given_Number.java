package LinkedList;
import java.util.*;
public class SLL_Occurence_Of_Given_Number {
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
	
	public static int occurenceOfGivenNumber(SLL.Node LL,int n){
		int count=0;
		SLL.Node temp=LL;
		while(temp!=null){
			if(temp.data==n){
				count++;
			}
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
		System.out.println();
		int numberToSearch=scan.nextInt();
		System.out.println(occurenceOfGivenNumber(ll.head,numberToSearch));
		
	}
}
