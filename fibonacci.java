package java_codes;

import java.util.Scanner;

public class fibonacci {

	public static void main(String[] args)
	{
		int n,sum=0,a=0,b=1;
		
		System.out.println("enter nth value:");
		
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		
		System.out.println("febonacci series: ");
	 
	    
		while(sum<=n) {
		System.out.println(""+sum);
        
		a=b;
		b=sum;
		sum=a+b;
		  	
		}
	    
	 
		
			
		
		
		

	}

}
