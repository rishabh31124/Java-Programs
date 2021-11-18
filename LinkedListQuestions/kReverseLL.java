package LinkedListQuestions;

import java.util.LinkedList;
import java.util.Stack;

import org.w3c.dom.Node;

//public class kReverseLL {
//	public void reverse(int k) {
//		// we have to return 3k but head is pointing 1k only so point head to the 3k
//		head = k_rev(head, k);
//	}

//	private Node k_rev(Node nn, int k) {
//		if (nn == null) {
//			return null;
//		}
//		Node nextProblem = nn;// we can take it as smaller problem
//		for (int i = 1; i <= k; i++) {
//			nextProblem = nextProblem.next;
//		}
//		// for connection
//		Node head_next_problem = k_rev(nextProblem, k);
//		Node prev = head_next_problem;
//		Node curr = nn;
//		for (int i = 0; i < k; i++) {
//			Node after = curr.next;// important steps for reversing linked list
//			prev = curr;
//			curr = after;
//		}
//		return prev;
//	}

	// by using stacks --------------------

//	private void k_rev(int k) {
//		Stack<Node> s = new Stack<>();
//		Node original = head;
//		Node newHead = null;
//		Node newTail = null;
//		while (original != null) {
//			// stack loop - push
//			while (s.size() < k && original != null) {
//				s.push(original);
//				original = original.next;
//			}
//			// stack loop - for pop
//			while (!s.isEmpty()) {
//				// store the popped elements in the new node
//				Node toAdd = s.pop();
//				if (newHead == null) {
//					newHead = toAdd;
//					newTail = toAdd;
//				} else {
//					newTail.next = toAdd;
//					newTail = toAdd;
//				}
//			}
//		}
//		head = newHead;
//		newTail.next = null;
//	}
//
//}
