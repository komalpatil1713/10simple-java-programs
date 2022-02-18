package java_codes;

import java.util.Scanner;

public class mirror_inverse {
	
		static boolean isMI(int arr[])
		{
			for (int i=0;i< arr.length;i++) {

				if (arr[arr[i]] != i)
					return false;
			}
			return true;
		}
		public static void main(String[] args)
		
		{
			
			int[]arr= {1,2,3,4};
			
			if (isMI(arr)) {
				System.out.println("Yes,array is mirror inverse");
			}
			else {
				System.out.println("No,array is not mirror inverse");
		}
		
	}
}


