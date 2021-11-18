package BinaryTree;

import java.util.*;

public class BinaryTree {
	Scanner sc = new Scanner(System.in);

	private class Node {
		int data;
		Node left;
		Node right;
	}

	Node Root;

	public BinaryTree(int[] in, int[] pre) {
		Root = Cons(in, 0, in.length - 1, pre, 0, pre.length - 1);
	}

//	int[] in = {40,20,50,10,30,70};
//	int[] pre = {10,20,40,50,30,70};
	public Node Cons(int[] in, int i_start, int i_end, int[] pre, int p_start, int p_end) {
		if (i_start > i_end || p_start > p_end)
			return null;
		int root = pre[p_start];
		int found = 0;
		int lnum = 0;
		for (int i = i_start; i <= i_end; i++) {
			if (root == in[i]) {
				found = i;
			}
			lnum++;
		}
		Node n = new Node();
		n.data = root;
		n.left = Cons(in, i_start, found - 1, pre, p_start + 1, p_start + lnum);// very importand pre start and end--
		n.right = Cons(in, found + 1, i_end, pre, p_start + lnum, p_end);
		return n;
	}

	public BinaryTree() {
//		super();
		Root = cons(null, false);
	}

	private Node cons(Node parent, boolean child) {
		if (parent == null)
			System.out.println("Enter root node: ");
		else if (child)// true k liye yh chalega
			System.out.println("If " + parent.data + " having left child then " + "Enter your left child: ");
		else// false k liye chalega
			System.out.println("If " + parent.data + " having right child then " + "Enter your right child: ");
		Node nn = new Node();
		nn.data = sc.nextInt();
		System.out.println(nn.data + " having left child :- ");
		boolean hasLeft = sc.nextBoolean();
		if (hasLeft)
			nn.left = cons(nn, true);
		System.out.println(nn.data + " having right child :- ");
		boolean hasRight = sc.nextBoolean();
		if (hasRight)
			nn.left = cons(nn, false);
		return nn;

	}

	public void display() {
		// data abstraction -----
		disp(Root);
	}

	private void disp(Node nn) {
		if (nn == null)
			return;
		// self work
		String str = " ";
		if (nn.left != null)
			str += nn.left.data;
		str = str + " -> " + nn.data + " <- ";
		if (nn.right != null)
			str += nn.right.data;
		System.out.println(str);
		// smaller problems will be--
		disp(nn.left);
		disp(nn.right);
	}

	public int size() {
		return treeSize(Root);
	}

	private int treeSize(Node nn) {
		if (nn == null)
			return 0;
		int LeftTreeSize = treeSize(nn.left);
		int RightTreeSize = treeSize(nn.right);
		return LeftTreeSize + RightTreeSize + 1;// plus one important
	}

	public int maximum() {
		return max(Root);
	}

	private int max(Node nn) {
		if (nn == null)
			return Integer.MIN_VALUE;
		int leftMax = max(nn.left);
		int rightMax = max(nn.right);
		return Math.max(nn.data, Math.max(leftMax, rightMax));
	}

	public boolean find(int ele) {
		return finding(Root, ele);
	}

	private boolean finding(Node nn, int ele) {
		if (nn == null) {
			return false;
		}
		if (nn.data == ele) {
			return true;
		}
		boolean left = finding(nn.left, ele);
		boolean right = finding(nn.right, ele);
		return left || right;
	}

	public int height() {
		return height(Root);
	}

	private int height(Node nn) {
		if (nn == null) {
			return -1;
		}
		int left = height(nn.left);
		int right = height(nn.right);
		return (Math.max(left, right) + 1);
	}

	public int leaf() {
		return leaf(Root);
	}

	private int leaf(Node nn) {
		if (nn == null) {
			return 0;
		}
		// for detecting leaf node
		if (nn.left == null && nn.right == null) {
			return 1;
		}
		int left = leaf(nn.left);
		int right = leaf(nn.right);
		return (left + right);
	}

	public int diameter() {
		return diameter(Root);
	}

	int maximumDiameter = -1;

	private int diameter(Node nn) {
		if (nn == null) {
			return 0;
		}
		// went to every node
		int leftdia = diameter(nn.left);
		int rightdia = diameter(nn.right);
		// calculate the maximum distance btw 2 nodes passig through nn
		// time complexity : o(n)
		int left = height(nn.left);
		int right = height(nn.right);
		int childdia = Math.max(leftdia, rightdia);
		int currentDiameter = left + right + 2;
		maximumDiameter = Math.max(childdia, currentDiameter);
		return maximumDiameter;
	}

	public boolean flipEquiv(Node root1, Node root2) {
		if (root1 == null && root2 == null) {
			return true;
		}
		if (root1 == null || root2 == null || root1.data != root2.data) {
			return false;
		}

		// agar flip hua
		boolean flip = flipEquiv(root1.right, root2.left) && flipEquiv(root1.left, root2.right);
		// agar flip na ho
		boolean noFlip = flipEquiv(root1.left, root2.left) && flipEquiv(root1.right, root2.right);
		return flip || noFlip;
	}
	public void lvl_traversal()
	{
		Queue<Node> q = new LinkedList<>();
		q.add(Root);
		while(!q.isEmpty())
		{
			Node curr = q.poll();
			if(curr == null)
				continue;
			//self work 
			System.out.println(curr.data+" -- ");
			//add children -- 
			q.add(curr.left);
			q.add(curr.right);	
		}
	}
	public void lvl_traversal2()
	{
		Queue<Node> curr_level = new LinkedList<>();
		Queue<Node> next_level = new LinkedList<>();
		curr_level.add(Root);
		while(!curr_level.isEmpty())
		{
			Node curr = curr_level.poll();
			if(curr == null)
				continue;
			//self work
			System.out.println(curr.data+" -- ");
			
			//add children
			next_level.add(curr.left);
			next_level.add(curr.right);
			//important making sub nodes 
			if(curr_level.isEmpty())
			{
				curr_level = next_level;
				next_level = new LinkedList<>();//next node to be null/new node;
				System.out.println();
			}
		}
	}
	
	// ---------- Binary search tree ----------- 
	// bst is nothing but all nodes in left < root < all nodes in right
	public int max_Bst()
	{
		Node temp = Root;
		while(temp.right!=null)
		{
			temp = temp.right;
		}
		return temp.data; // return deepest max right node
	}
	public boolean find_bst(int ele)
	{
		//overloading + data abstraction
		return find_bst(Root,ele);
	}
	private boolean find_bst(Node nn , int ele)
	{
		if(nn == null)
			return false;
		if(nn.data == ele)
			return true;
		else if(nn.data > ele)
			return find_bst(nn.left,ele);//chota ho th bs left mein search karo
		else
			return find_bst(nn.right,ele);// bada ho toh bs right mein search karo
	}

}
