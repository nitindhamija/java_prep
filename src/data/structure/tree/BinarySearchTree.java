package data.structure.tree;

/*Time Complexity: The worst case time complexity of search and insert operations is O(h) where h is 
 * height of Binary Search Tree. In worst case, we may have to travel from root to the deepest leaf node. 
 * The height of a skewed tree may become n and the time complexity of search and insert operation may become O(n).
 * 
 * Inorder traversal of BST always produces sorted output.
We can construct a BST with only Preorder or Postorder or Level Order traversal. Note that we can always get 
inorder traversal by sorting the only given traversal.
 */

public class BinarySearchTree {
	Node root;

	public BinarySearchTree() {
		super();
	}

	public static void main(String[] args) {
		BinarySearchTree BSTtree = new BinarySearchTree();
		int[] arr = { 11, 6, 8, 19, 4, 10, 5, 17, 43, 49, 31 };
		// int i=0;
		// BSTtree.root= new Node(arr[0]);
		for (int i : arr) {
			BSTtree.root = constructBST(i, BSTtree.root);
		}
		System.out.print("inorder->");
		inorderTraversal(BSTtree.root);
		constructBST(15, BSTtree.root);// insertion in BST similar logic as in case of creation.

		System.out.println("inorder->");
		inorderTraversal(BSTtree.root);
		System.out.println("");
		Node key = SearchBST(100, BSTtree.root);
		System.out.println("found node " + key.data);

	}

	public static Node constructBST(int n, Node root) {

		if (root == null)
			return new Node(n);
		if (n < root.data)
			root.left = constructBST(n, root.left);
		else
			root.right = constructBST(n, root.right);

		return root;

	}

	public static Node SearchBST(int key, Node root) {

		if (root == null )
			return new Node(-1);
		if( root.data == key)
			return root;
		if (key < root.data)
			return SearchBST(key, root.left);
		else
			return SearchBST(key, root.right);
		
		

	}

	/*
	 * inorder traversal of BST will result in sorted data as it is left root right
	 * and since in BST for each node this is true left<root<right
	 */
	public static void inorderTraversal(Node root) {

		if (root != null) {
			inorderTraversal(root.left);
			System.out.print(root.data + "->");
			inorderTraversal(root.right);
		}

	}
}
