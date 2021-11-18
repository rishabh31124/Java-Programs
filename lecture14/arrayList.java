package lecture14;
import java.util.ArrayList;
// array list is a dynamic array of elements in which we can put elements without denoting any size
public class arrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<Integer>(); // to make new array list
		System.out.println(list);
		System.out.println(list.size());// it give size of list
		list.add(2); // add function adds the value in the list at the end
		list.add(4);
		list.add(5);
		list.add(6);
		System.out.println(list+"---");
		list.add(1,3); // index , value
		System.out.println(list+"---");
		int k = list.get(2); // we put index in get function to get value at that index
		System.out.println(k+" **");
		list.set(2, 15); // to update value by set function(index, value)
		System.out.println(list+"---");
		list.remove(2);// to delete the value at the given index by remove function
		System.out.println(list+"---");
		// to print the elements of the list
		for(int i = 0; i < list.size(); i++)
		{
			System.out.print(list.get(i)+" ");
		}
	}
	

}
