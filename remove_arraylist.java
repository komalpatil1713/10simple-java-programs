package java_codes;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class remove_arraylist {
 
	public static void main(String[] args) 
	
	{ 
		List<Integer> no = new ArrayList<Integer>(3); 
	no.add(1);
	no.add(2); 
	no.add(3); 
	System.out.println("Array list : " + no);
	no.remove(0);
	System.out.println("Updated Array list : " + no);
	
	}

	 
}

  
    
