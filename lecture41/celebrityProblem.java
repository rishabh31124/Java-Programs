package lecture41;

import java.util.Stack;

//to select celebrity from the matrix
public class celebrityProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] relation = { { 0, 1, 1, 1 }, { 1, 0, 1, 0 }, { 0, 0, 0, 0 }, { 1, 1, 1, 0 } };
		celebrity(relation);
	}

	public static void celebrity(int[][] relation) {
		Stack<Integer> potential = new Stack<>();
		for (int i = 0; i < relation.length; i++)
			potential.push(i);
		while (potential.size() > 1) {
			int A = potential.pop();
			int B = potential.pop();
			if (relation[A][B] == 1)// a knows b
				potential.push(B);
			else
				potential.push(A);
		}
		int celeb = potential.pop();
		// checking row
		for (int j = 0; j < relation.length; j++) {
			if (relation[celeb][j] == 1) {
				System.out.println("Lies no celeb");
				return;
			}
			// checking column
			if (j != celeb && relation[j][celeb] == 0) {
				System.out.println("Lies no celeb");
				return;
			}
		}
		System.out.println(celeb + " is a real person");
	}
}
