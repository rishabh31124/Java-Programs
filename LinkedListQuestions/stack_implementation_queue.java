package LinkedListQuestions;

import java.util.LinkedList;
import java.util.Queue;

public class stack_implementation_queue {
	Queue<Integer> qs = new LinkedList<>();
	public void push(int ele)
	{
		qs.add(ele);
	}
	public int pop()
	{
		Queue<Integer> duplicate = new LinkedList<>();
		while(qs.size()>1)
		{
			duplicate.add(qs.poll());
		}
		int temp = qs.poll();
		while(!duplicate.isEmpty())
		{
			qs.add(duplicate.poll());
		}
		return temp;
	}
}
