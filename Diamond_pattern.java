package java_codes;

import java.util.Scanner;

public class Diamond_pattern {

	public static void main(String args[]) 
    {
        int n, i,k, count = 1;
      
        System.out.print("Enter the number of rows: ");
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        
        count = n - 1;
        for (k=1;k<= n;k++) 
        {
            for (i = 1; i <= count; i++) 
            {
                System.out.print(" ");
            }
            count--;
            for (i = 1; i <= 2 *k-1; i++) 
            {
                System.out.print("*");                
            }
            System.out.println("");
        }
        
        count = 1;
        for (k=1;k<=n-1;k++) 
        {
            for (i=1;i<= count;i++) 
            {
                System.out.print(" ");
            }
            count++;
            for (i=1;i<=2*(n-k)-1;i++) 
            {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}