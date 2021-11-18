package BinaryTree;

//import BinaryTree.BinaryTree.Node;

public class bst {

	private class Node {
		int data;
		Node left;
		Node right;
	}

	Node Root;
	public bst()
	{
		
	}
	public bst(int[] in)
	{
		Root = create(in,0,in.length - 1);
	}
	public int Max() {
		return Max(Root);
	}

	private int Max(Node nn) {
		if (nn == null) {
			return Integer.MIN_VALUE;
		}
		int Max_L = Max(nn.left);
		int Max_R = Max(nn.right);

		return Math.max(nn.data, Math.max(Max_L, Max_R));
	}
	// inorder se unique binary search tree banana
	private Node create(int[] in , int lo ,int hi)
	{
		if(lo > hi)
			return null;
		int mid = ( lo + hi ) / 2 ;
		Node n = new Node();
		n.data = in[mid];
		n.left = create(in,lo,mid-1);
		n.right = create(in,mid+1,hi);
		return n;
	}
	//addition(add element 25 in bst ) in binary search tree -------
	public void add(int ele)
	{
		Root = add(Root,ele);
	}
	private Node add(Node curr , int ele)
	{
		if(curr == null)
		{
			Node n = new Node();
			n.data = ele;
			return n;
		}
		if(ele < curr.data)
		{
			curr.left = add(curr.left,ele);
		}
		else
		{
			curr.right = add(curr.right,ele);
		}
		return curr;
	}
	// deletion (delete element 10 in bst ) in binary search tree
	public void remove(int ele)
	{
		Root = remove(Root,ele);
	}
	private Node remove(Node curr , int item)
	{
		if(item < curr.data)
		{
			curr.left = remove(curr.left,item);
		}
		else if(item > curr.data)
		{
			curr.right = remove(curr.right,item);
		}
		else
		{
			if(curr.left == null && curr.right == null)
			{
				System.out.println("case 1 ------- ");
				return null;
			}
			else if (curr.left != null && curr.right == null)
			{
				System.out.println("case 2 ------- ");
				return curr.left;
			}
			else if (curr.left == null && curr.right != null)
			{
				System.out.println("case 3 ------- ");
				return curr.right;
			}
			else
			{
				System.out.println("case 4 ------- ");
				//replace : 
				//step 1 - left tree - max
				// right tree - min
				int leftMax = Max(curr.left);
				curr.data = leftMax;
				curr.left = remove(curr.left,leftMax);
			}
		}
		return curr;
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
	
}
