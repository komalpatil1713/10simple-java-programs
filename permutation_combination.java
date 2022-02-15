package java_codes;

import java.util.Scanner;

public class permutation_combination {
	
	static int fact(int n ){
   
		//factorial
		 
		int f = 1;
	    for (int i = 1; i <= n; i++)
	    {
	            f *= i;
	    }
	        return f;
	}
	
	public static void main(String[] args) {
		 
		 
		 int n,r, c, p ;
           
           System.out.println("enter two numbers:");

           Scanner sc = new Scanner(System.in);
           n=sc.nextInt();
           r=sc.nextInt();
           
           //permutation
           
		   p = fact(n) / fact(n-r);
		   System.out.println("Permutation: " + p);
			
		   //combination
		   
		   c = fact(n) / (fact(r) * fact(n-r));
	       System.out.println("Combination: " + c);
			   }

	}


