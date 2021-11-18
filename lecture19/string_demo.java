package lecture19;

public class string_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "hello";
		String s1 = "bye";
		String s2 = "hello llo lol";
		String s3 = "";
		System.out.println("-------------------------- ");
		System.out.println(s + " : " + s1);
		System.out.println("-------------------------- ");
		System.out.println(s + " : " + s1);
		System.out.println("-------------------------- ");
		System.out.println("------- length --------------- ");
		System.out.println(s.length());
		System.out.println("-------------------------- ");
		System.out.println("------- getting characters from string ---------------- ");
		System.out.println(s.charAt(2));
		System.out.println("-------------------------- ");
		System.out.println("--------- making substring ----------------- ");
		System.out.println(s.substring(0,3));
		System.out.println("-------------------------- ");
		System.out.println("----------- finding index of substring------------- ");
		System.out.println(s.indexOf("ll"));
		System.out.println("-------------------------- ");
		System.out.println("-------------- lastindex ------------ ");
		System.out.println(s.lastIndexOf("ll"));
		System.out.println("-------------------------- ");
		System.out.println("---------- boolean return checks condition ---------------- ");
		System.out.println(s.startsWith("he"));
		System.out.println("-------------------------- ");
		System.out.println("---------boolean return checks condition ----------------- ");
		System.out.println(s.endsWith("ll"));
		System.out.println("-------------------------- ");
		System.out.println("---------- concatenation of two strings ---------------- ");
		System.out.println(s.concat(s1));
		System.out.println("-------------------------- ");
		System.out.println("---------boolean return checks condition ----------------- ");
		System.out.println(s == s1);
		System.out.println("-------------------------- ");
		System.out.println("---------boolean return checks condition ----------------- ");
		System.out.println(s.equals(s1));
		System.out.println("-------------------------- ");
		System.out.println("-------- replace characters in string ------------------ ");
		System.out.println(s.replace('l', 'o'));
		System.out.println("-------------------------- ");
		System.out.println("--------- return unicode difference ----------------- ");
		System.out.println(s.compareTo(s1));
		System.out.println("-------------------------- ");
	}

}
