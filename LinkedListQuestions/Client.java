package LinkedListQuestions;

import java.util.LinkedList;

public class Client {
	public static void main(String[] args) {
		Questions ll = new Questions();
//		LinkedList ll = new LinkedList();
		
		ll.addLast(10);
		ll.addLast(20);
		ll.addLast(30);
		ll.addLast(40);
		ll.addLast(50);
//		ll.addLast(60);
		
		ll.display();
		System.out.println(ll.Mid_point());
		ll.display();
		System.out.println(ll.k_last(1));
		System.out.println(ll.k_last(2));
		System.out.println(ll.k_last(3));
		System.out.println(ll.k_last(4));
	}

}
