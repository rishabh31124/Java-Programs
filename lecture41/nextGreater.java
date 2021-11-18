package lecture41;

import java.util.Stack;

// from the array we have to find next greater inn big of n complexity
public class nextGreater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 50, 30, 20, 40, 10, 45, 5, 65, 60, 15, 8 };
		nextGgreater2(arr);
	}

	public static void nextGgreater(int[] arr) {
		Stack<Integer> ans = new Stack<>();
		for (int i = 0; i < arr.length; i++) {
			while (!ans.isEmpty() && arr[i] >= ans.peek()) {
				int ans1 = ans.pop();
				System.out.println(ans1 + " -> " + arr[i]);
			}
			ans.push(arr[i]);
		}
		while (!ans.isEmpty()) {
			int ans1 = ans.pop();
			System.out.println(ans1 + " -> "+ -1);
		}
	}
	public static void nextGgreater2(int[] arr) {
		Stack<Integer> ans = new Stack<>();
		int[] ans_order = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			while (!ans.isEmpty() && arr[i] >= ans.peek()) {
				int ans1 = ans.pop();
				ans_order[ans1] = arr[i];
				System.out.println(ans1 + " -> " + arr[i]);
			}
			ans.push(i);
		}
		while (!ans.isEmpty()) {
			int ans1 = ans.pop();
			ans_order[ans1] = -1;
			System.out.println(ans1 + " -> "+ -1);
		}
	}
}
