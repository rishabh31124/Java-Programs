package LinkedListQuestions;

import java.util.LinkedList;
import java.util.Stack;

import org.w3c.dom.Node;

public class Questions {
	private class Node {
		int data;
		Node next;

		public Node() {

		}

		public Node(int data) {
			super();
			this.data = data;
		}
	}

	Node head;

	public void display() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.println("");
		System.out.println("---------------S");
	}

	public void addLast(int ele) {
//		Go to Last Node
		if (head == null) {
			Node nn = new Node();
			nn.data = ele;

			head = nn;
		} else {

			Node temp = head;
			while (temp.next != null) {
				// Jump
				temp = temp.next;
			}

			Node nn = new Node();
			nn.data = ele;
			temp.next = nn;
		}
	}

	public int Mid_point() {
		Node slow = head;
		Node fast = head;
		while (fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow.data;
	}

	public int k_last(int k) {
		Node fast = head;
		Node slow = head;
		for (int i = 0; i < k; i++) {
			fast = fast.next;
		}
		while (fast != null) {
			slow = slow.next;
			fast = fast.next;
		}
		return slow.data;
	}
	public void k_rev(int k) {
		Stack<Node> s = new Stack<>();
		Node original = head;
		Node newHead = null;
		Node newTail = null;
		while (original != null) {
			// stack loop - push
			while (s.size() < k && original != null) {
				s.push(original);
				original = original.next;
			}
			// stack loop - for pop
			while (!s.isEmpty()) {
				// store the popped elements in the new node
				Node toAdd = s.pop();
				if (newHead == null) {
					newHead = toAdd;
					newTail = toAdd;
				} else {
					newTail.next = toAdd;
					newTail = toAdd;
				}
			}
		}
		head = newHead;
		newTail.next = null;
	}

	public Node intersection(Node headA, Node headB) {
		//https://leetcode.com/problems/intersection-of-two-linked-lists/
		Node car1 = headA;
		Node car2 = headB;
		// intersecting condition
		while (car1 != car2) {//when both car intersect -- loop breaks
			if (car1 == null)
				car1 = headB;//when car1 length completes make him sit at top of car2 path
			else
				car1 = car1.next;
			if (car2 == null)
				car2 = headA;//when car2 length completes make him sit at top of car1 path
			else
				car2 = car2.next;
		}
		return car1;
	}
	public boolean isCyclic()
	{
		Node fast = head;
		Node slow = head;
		while(fast!=null&&fast.next!=null)// first null na ho and last null na ho 
		{
			fast = fast.next.next;
			slow = slow.next;
			if(fast == slow)// jab meet kar jaye tab return kara do because these are cyclic
				return true;
		}
		return false;
	}
	public int sizeCycle()
	{
		int size=1;
		Node fast = head;
		Node slow = head;
		while(fast!=null && fast.next!=null)
		{
			slow = slow.next;
			fast = fast.next.next;
			if(fast == slow)
				break;//crashing point
			
		}
		while(slow.next!= fast)
		{
			slow = slow.next;
			size++;
		}
		return size;
	}
	public void breakCyclic()
	{
		// time complexity ---------------- n
		//size code
		int size=1;
		Node fast = head;
		Node slow = head;
		while(fast!=null && fast.next!=null)
		{
			slow = slow.next;
			fast = fast.next.next;
			if(fast == slow)
				break;//crashing point
			
		}
		while(slow.next!= fast)
		{
			slow = slow.next;
			size++;
		}
		// -------------------------------------------
		// two cars ko chala do ----------------------------------
		Node car1 = head;
		for(int i = 0; i <size;i++) {
			car1 = car1.next;
		}
		Node car2 = head; // -------- n cyclic size hone k baad dusri car ko chala do --------
		while(car1.next!= car2.next)// ---------jab tackrane wali ho tb rok do ---------------------------------------
		{
			car1 = car1.next;
			car2 = car2.next;
		}
		car1.next = null;
		
	}
	public void breakCyclic2()
	{
		Node fast = head;
		Node slow = head;
		while(fast!=null&&fast.next!=null)// first null na ho and last null na ho 
		{
			fast = fast.next.next;
			slow = slow.next;
			if(fast == slow)// jab meet kar jaye tab return kara do because these are cyclic
				break;
		}
		Node car = head;
		while(car.next!= fast.next)
		{
			car= car.next;
			fast = fast.next;
		}
		fast.next = null;
	}

}
