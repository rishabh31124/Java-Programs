package lecture38;

public class client_queue {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		queue obj = new queue();
		obj.enqueue(10);
		obj.enqueue(20);
		obj.enqueue(30);
		obj.enqueue(40);
//		obj.enqueue(50);
//		obj.display();
//		System.out.println(obj.dequeue());
//		System.out.println(obj.dequeue());
		obj.display();
//		obj.enqueue(60);
	}

}
