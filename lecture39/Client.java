package lecture39;

public class Client {
	// Inheritance Concept ------ Child class inherits the properties of Parent class
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child ch = new Child();
//		ch.fun();
		
		
		
		// case 2
		Parent obj2 = new Child();// child object and parent reference
//		
//		System.out.println(obj2.data1);
//		System.out.println(obj2.data2);//not execute
//		System.out.println(((Child)obj2).data2);// type caste of child object
//		System.out.println(obj2.data);
		
		obj2.fun1();
		((Child)obj2).fun2();// type caste -- it is so because child inherits parent
		obj2.fun();// object function works not reference function just opposite
	
	
		// case 3
//		Child obj3 = new Parent();// not possible
	
		//case 4
		Child obj4 = new Child();
		obj4.fun();
	}

}
