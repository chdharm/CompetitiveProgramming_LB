package BinaryTree;

public class CheckingIfBST {
	Node root;
	Node prev;
	boolean isBST() {
		return isBST(root);
	}
	boolean isBST(Node root) {
		if (root != null) 
        { 
            if (!isBST(root.left)) 
                return false; 
            if (prev != null && root.data <= prev.data ) 
                return false; 
            prev = root; 
            return isBST(root.right); 
        } 
        return true; 
	}
	public static void main(String args[]) 
    { 
		CheckingIfBST tree = new CheckingIfBST(); 
        tree.root = new Node(4); 
        tree.root.left = new Node(2); 
        tree.root.right = new Node(5); 
        tree.root.left.left = new Node(1); 
        tree.root.left.right = new Node(3); 
  
        if (tree.isBST()) 
            System.out.println("IS BST"); 
        else
            System.out.println("Not a BST"); 
    }
}
