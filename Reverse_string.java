package java_codes;

import java.util.Scanner;

public class Reverse_string {

	 public static void main (String[] args) {
	       
	      String str,nstr="";
	      char ch;
	       
	      System.out.print("enter string: ");
	      Scanner sc=new Scanner(System.in);
	      str= sc.nextLine();
	      
	      
	      for (int i=0; i<str.length(); i++)
	      {
	        ch= str.charAt(i); 
	        nstr= ch+nstr; 
	      }
	      System.out.println("Reversed string: "+ nstr);
	    }
    }


