package lecture34;

import java.util.Scanner;

public class power {

	 public static void main(String args[]) {
	        // Your Code Here
//	        Scanner sc = new Scanner(System.in);
//	        int x = sc.nextInt();
//	        int n = sc.nextInt();
//	        System.out.println(pow(x,n));
	        System.out.println(pow(2,3));
	    }
	    static int pow(int a, int n)
	    {
	        if(n == 0)
	        {
	            return 1;
	        }
	        
	        if(n%2 == 1) // for odd n values
	        {
	            int sp = pow(a,n/2);
	            return sp*sp *a;
	        }
	        else
	        {
	            int sp = pow(a,n/2);
	            return sp*sp;
	        }
	        

	    }
	}
