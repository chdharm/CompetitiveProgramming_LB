package BinaryTree;
import java.util.Queue; 
import java.util.LinkedList;

public class PrintLevelOrderTraversal2 {
	Node root; 
	  

    void printLevelOrder()  
    { 
        Queue<Node> queue = new LinkedList<Node>(); 
        queue.add(root); 
        while (!queue.isEmpty())  
        { 

            Node tempNode = queue.poll(); 
            System.out.print(tempNode.data + " "); 
  
            if (tempNode.left != null) { 
                queue.add(tempNode.left); 
            } 
  
            if (tempNode.right != null) { 
                queue.add(tempNode.right); 
            } 
        } 
    } 
  
    public static void main(String args[])  
    { 
    	
    	PrintLevelOrderTraversal2 tree_level = new PrintLevelOrderTraversal2(); 
        tree_level.root = new Node(1); 
        tree_level.root.left = new Node(2); 
        tree_level.root.right = new Node(3); 
        tree_level.root.left.left = new Node(4); 
        tree_level.root.left.right = new Node(5); 
  
        System.out.println("Level order traversal of binary tree is - "); 
        tree_level.printLevelOrder(); 
    } 
}
