package data.structure.tree;

public class BinaryTree {
	Node root;

	public BinaryTree(int data) {
		super();
		root = new Node(data);
	}

	public BinaryTree() {
		super();
		root = null;
	}

	public static void main(String[] args) {
		BinaryTree tree = new BinaryTree(); //each node having atmost 2 children
		int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
		// int i=0;
		Node root = constructBinaryTree(arr, 0, tree.root);
		System.out.print("inorder->");
		inorderTraversal(root);
		System.out.println("");
		System.out.print("preorder->");
		preorderTraversal(root);
		System.out.println("");
		System.out.print("postorder->");
		postorderTraversal(root);
	}

	public static Node constructBinaryTree(int[] arr, int i, Node root) {

		if (i >= arr.length)
			return null;
		root = new Node(arr[i]);
		root.left = constructBinaryTree(arr, 2 * i + 1, root.left);
		root.right = constructBinaryTree(arr, 2 * i + 2, root.right);
		return root;
	}

	// left->root->right
	public static void inorderTraversal(Node root) {

		if (root != null) {
			inorderTraversal(root.left);
			System.out.print(root.data + "->");
			inorderTraversal(root.right);
		}

	}
	//root->left->right
	public static void preorderTraversal(Node root) {

		if (root != null) {
			System.out.print(root.data + "->");
			preorderTraversal(root.left);
			preorderTraversal(root.right);
		}

	}
	//left->right->root
	public static void postorderTraversal(Node root) {

		if (root != null) {
			postorderTraversal(root.left);
			postorderTraversal(root.right);
			System.out.print(root.data + "->");
		}

	}
}
