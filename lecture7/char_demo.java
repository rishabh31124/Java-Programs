package lecture7;

public class char_demo {

	public static void main(String[] args) {
		int n1 = 'c' + 'a'; 
		System.out.println(n1);
		char ch = 'b';
		int i = (int) ch; // method to find unicode of the character
		System.out.println(i);	
		int n2 = 12 + ch; // gives integer output (*** int + char ***)
		System.out.println(n2);		
	}

}
