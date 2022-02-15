package java_codes;

import java.util.Scanner;

public class palindrome {

	public static void main(String[] args) 
	{
     	      String s,r="";
		 
     	      //Taking input from user
     	      
		      System.out.println("Enter a string:");
		      Scanner sc = new Scanner(System.in);
		      
		      s= sc.nextLine();
		 
		      int length = s.length();
		 
		      for ( int i = length - 1; i >= 0; i-- ) 
		         r = r + s.charAt(i);
		 
		       //checking   
		      if (s.equals(r)) 
		      {
		         System.out.println("yes,"+s+" is a Palindrome");
		      }
		      else 
		      {
		         System.out.println("No,"+s+" is not a Palindrome");
		      }
		   }

	}


