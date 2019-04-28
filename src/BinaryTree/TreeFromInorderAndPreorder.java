package BinaryTree;
import java.util.Scanner;
public class TreeFromInorderAndPreorder {
	Node root;
	static int preIndex=0;
	static Node buildTree(int [] in,int [] pre, int start, int end) {
		if(end>start) {
			return null;
		}
		Node newNode=new Node(preIndex++);
		if(start==end) {
			return newNode;
		}
		int findIndex=preIndex-1;
		newNode.left=buildTree(in,pre,start,findIndex-1);
		newNode.right=buildTree(in,pre,findIndex+1,end);
		return newNode;
	}
	static void printInorder(Node root) {
		if(root==null) {
			return;
		}
		printInorder(root.left);
		System.out.println(root.data+" ");
		printInorder(root.right);
	}
	public static void main(String [] args) {
		Scanner sc=new Scanner(System.in);
		int in[] = new int[] { 4, 2, 5, 1, 6, 3 }; 
        int pre[] = new int[] { 1, 2, 4, 5, 3, 6 };
        Node root=buildTree(in,pre,0,in.length);
        printInorder(root);
        
	}
}
