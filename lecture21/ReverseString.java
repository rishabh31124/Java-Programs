package lecture21;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "The sky is blue";
		// space ka index nikalo
		// extract the word from the string
		//print the word
		// apply the termination condition
		// string ko index tak update kar do
		while (true) {
			int index = s.lastIndexOf(' ');
			String word = s.substring(index + 1);
			System.out.print(word + " ");
			if (index == -1) { // termination condition
				break;
			}
			s = s.substring(0, index);
		}
	}

}
