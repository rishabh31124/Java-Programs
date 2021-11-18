package lecture38;

public class queue {
	private int[] data;
	private int front;
	private int size;

	public queue() {
		data = new int[5];
		front = 0;
		size = 0;
	}

	public queue(int cap) {
		data = new int[cap];
		front = 0;
		size = 0;
	}

	public void enqueue(int ele) throws Exception  {
		if(isFull())
		{
			throw new Exception("Stack is full!!!");
		}
		int rear = (front + size)%data.length;
		data[rear] = ele;
		size++;
		return;
	}

	public int dequeue() throws Exception {
		if(isEmpty())
		{
			throw new Exception("Stack is Empty!!!");
		}
		int temp = data[front];
		front= (front + 1)%data.length;////////////////////////////
		size--;
		return temp;
	}

	public int size() {
		return size;
	}
	public boolean isFull(){
		return size == data.length;
	}
	public boolean isEmpty(){
		return size == 0;
	}
	public void display() {
//		int temp = front;
//		while(temp<size) {
//			System.out.print(data[temp]+" ");
//			temp++;
//		}
//		System.out.println();
		for(int i = 0; i < size; i++) {
			int temp = (front+1)%data.length;
			System.out.print(data[temp]+" ");
		}
		System.out.println();
	}
}
