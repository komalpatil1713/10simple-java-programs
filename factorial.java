package java_codes;

import java.util.Scanner;

public class factorial {

	public static void main(String[] args) 
	{
			int n,i,f=1;  
		
			//taking input from user
			
		    System.out.println("enter the number:");
		
		    Scanner sc = new Scanner(System.in);
		
		    n=sc.nextInt();
		
		    for(i=1;i<=n;i++)
		    {    
		      f=f*i;    
		    }    
		  
		    System.out.println("Factorial of "+n
				  + ":"
				  +f);    
		 }  
		

	}

