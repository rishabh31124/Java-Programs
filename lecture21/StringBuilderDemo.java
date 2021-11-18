package lecture21;

public class StringBuilderDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String s ="hello";
		string_builder();
		// time complexity O(n)
	}
	static void string_builder()
	{
		StringBuilder sb = new StringBuilder("hello"); // how to make mutable string with the help of String builder
		// similar to string part
		// print
		System.out.println(sb);
		// get characters
		System.out.println(sb.charAt(1));
		// substring
		System.out.println(sb.substring(3));
		// different from string part most important
		
		// add at the end in the string
		sb.append("-rishabh");
		System.out.println(sb);
		// insert
		sb.insert(0,"Yo! ");
		System.out.println(sb);
		// set
		sb.setCharAt(2, '=');
		System.out.println(sb);
		// delete character
		sb.deleteCharAt(2);
		System.out.println(sb);
		//delete
		sb.delete(2, 5); // (including, excluding);
		System.out.println(sb);
		}

}
