package java_codes;

import java.util.Scanner;

public class calculator {

	public static void main(String[] args)
{
    
    double n1, n2,ans=0;

    // Taking inputs from user 

    Scanner sc = new Scanner(System.in);

    System.out.println("Enter two numbers:");

    n1 = sc.nextDouble();

    n2 = sc.nextDouble();
  
    System.out.println("select operator:"
    		+ "\n (+)addition"
    		+ "\n (-)substraction"
    		+ "\n (*)multiplication"
    		+ "\n (/)division");

    char opt = sc.next().charAt(0);

  switch (opt) {

    // add
    case '+':
    	ans = n1 + n2;

        break;

    // sub
    case '-':
        ans = n1 - n2;

        break;

    // mul
    case '*':
        ans = n1 * n2;

        break;

    // div
    case '/':
        ans = n1 / n2;

        break;

    default:

        System.out.println("wrong input!!!");

        break;
    }

    System.out.println("Answer:"+ ans);
  
}
}