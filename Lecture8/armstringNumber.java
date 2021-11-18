package Lecture8;

import java.util.Scanner;

public class armstringNumber {
	
	public static boolean isArmNum( int n ) {
		boolean flag = true;
		int temp = n;
		int count = 0;
		int m = 0;
		while(temp!=0) {
			temp /=10;
			count++;
		}
		int temp1 = n;
		while(temp1!=0) {
			int div = temp1%10;
			m = m + (int)Math.pow(div, count);
			temp1 /= 10;
		}
		if(m!=n) {
			flag = false;
		}
		return flag;
	}
	
	public static void armNumb(int l, int u) {
		for(int i = l;i<=u;i++) {
			if(isArmNum(i) == true) {
				System.out.println(i);
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int lower = sc.nextInt();
		int upper = sc.nextInt();
		armNumb(lower,upper);
		
	}

}
