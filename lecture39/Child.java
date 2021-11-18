package lecture39;

public class Child extends Parent {
	int data = 20;
	int data2 = 30;
	public void fun()
	{
		super.fun1();//super keyword to use parent functions in child class
		System.out.println("CHILD FUN");
	}
	public void fun2()
	{
		System.out.println("child fun 2");
	}
}
