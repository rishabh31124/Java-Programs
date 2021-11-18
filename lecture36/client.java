package lecture36;

public class client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		student s = new student("a",1);
//		System.out.println(s.name+" - : - " +s.age);
		student s1 = new student("b",2); // giving same address
//		System.out.println(s);
//		System.out.println(s1);
//		test1(s,s1);
//		System.out.println(s.name+"-"+s1.name);
		System.out.println(" 2 case");
		test2(s,s1);
		System.out.println(s.name+" : "+s.age); 
		System.out.println(s1.name+" : "+s1.age); 
		System.out.println(" 3 case");
		test3(s,s1);
		System.out.println(s.name+" : "+s.age); 
		System.out.println(s1.name+" : "+s1.age); 
		
	}
	static void test1(student a, student b)
	{
		student temp = a;
		a=b;
		b = a;
	}
	static void test2(student a, student b)
	{
		String temp_s = a.name;
		a.name=b.name;
		b.name= temp_s;
		int temp_a = a.age;
		a.age=b.age;
		b.age= temp_a;
	}
	static void test3(student a, student b)
	{
		String temp_s = a.name;
		a.name=b.name;
		b.name= temp_s;
		a = new student("c",3);
		int temp_a = a.age;
		a.age=b.age;
		b.age= temp_a;
	}

}
