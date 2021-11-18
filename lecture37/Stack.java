package lecture37;

import java.util.*;

public class Stack {
	protected int data[];// make always private so it only be accessible in this class only
	protected int tos;

	public Stack() {
		data = new int[5];
		tos = -1;
	}

	public Stack(int cap) {
		data = new int[5];
		tos = -1;
	}

	public void push(int ele) throws Exception{
		if(isFull())
		{
			throw new Exception("Stack is Full!!");
		}
		tos++;
		data[tos] = ele;
	}

	public int pop() throws Exception{
		if(isEmpty())
		{
			throw new Exception("Stack is empty!!!!!!");
		}
		int temp = data[tos];
		tos--;
		return temp;
	}

	public int peek() throws Exception {
		if(isEmpty()) {
		throw new Exception("Stack is empty");
		}
		return data[tos];
	}

	public int size() {
		return tos + 1;
	}

	public boolean isFull() {
		return size() == data.length;
	}

	public boolean isEmpty() {
		return size() == 0;
	}

	public void display() {
		int temp = tos;
		while (temp >= 0) {
			System.out.print(data[temp] + " ");
			temp--;
		}
	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Stack s = new Stack();// not a generic
		s.push(10);
//		s.push(20);
//		s.push(20);
//		s.push(20);
//		s.display();
//		s.pop();
//		s.display();
//		s.push(50);
//		s.push(50);
		s.push(50);
		s.push(40);
		s.push(30);
		s.push(20);
//		s.push(10);
//		s.display();
		s.display();
	}

}
