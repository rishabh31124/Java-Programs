package BinaryTree;
//10 true 20 true 30 false false true 50 false false true 40 true 60 false false true 73 false false
public class client {
	public static void main(String[] args) {
//		BinaryTree bb = new BinaryTree();
		int[] in = {10,20,30,40,50,60,70}; 
		bst b = new bst(in);
//		b.display();
//		bst b = new bst();
//		b.add(25);
		b.remove(60);
		b.display();
//		bb.display();
//		System.out.println("---------------------");
		// size of the tree
//		System.out.println("size of the tree");
//		System.out.println(bb.size());
//		// maximum in the tree
//		System.out.println("Maximum in the tree");
//		System.out.println(bb.maximum());
		
//		System.out.println(bb.find(10));
//		System.out.println(bb.height());
//		System.out.println(bb.leaf());
//		System.out.println(bb.diameter());
	}
}
