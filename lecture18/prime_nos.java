package lecture18;

import java.util.Arrays;
// Time complexity is -------- n*log(log(n)) ----------

// fourth approach to find prime numbers with lesser t.c ------------------
// seive of eratawthones---------------
public class prime_nos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 100;
		s_soe(n);
	}
	public static void s_soe(int n)
	{
		boolean[] prime = new boolean[n+1];
		// default value of boolean = false ------
		Arrays.fill(prime, true);
		// 0,1 are not prime numbers -------
		prime[0] = false;
		prime[1] = false;
		// factor ki table ko false kardo because these are not prime anymore  -----
		for(int factor = 2; factor*factor <= n; factor++)
		{
			// sirf wahi table check kre jo pehle k factor nahi kate ho --------------
			if(prime[factor])
			{
				// 1 se isiliye ni liya because because number itself be a prime -----
				int mult = 2;
				// table wahan tak chalao jahan tak number ho
				while(mult*factor <= n)
				{
					prime[factor * mult] = false;
					mult++;
				}
			}
			
		}
		// print that index while is not cut under true loop -----------
		for(int i = 0; i<prime.length;i++)
		{
			if(prime[i])
			{
				System.out.println(i);
			}
		}
	}

}
