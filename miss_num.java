package missing_number;
import java.util.*;

public class miss_num {
	
	  public static int findMissingNumber(int[] arr) 
	  {
	            int n = arr.length + 1;  
	            int totalSum = n * (n + 1) / 2;  
	            int arrSum = 0;
	            
	            for (int num : arr)
	            {
	                arrSum += num;
	            }
	            
	           
	            return totalSum - arrSum;
	        
	 }
	    
	  
	    static void print_arr(int arr[],int n)
		{
			for(int i=0;i<n;i++)
			{
				System.out.println(arr[i]+" ");
				System.out.println();
			}
		 }
       
	  public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter size of array");
			int n = sc.nextInt();
			
			int[] array = new int[n];
			
			System.out.println("Enter elements of array");
			for(int i=0;i<n;i++)
			{
				array[i]=sc.nextInt();
			}
			
			System.out.println("Array: ");
			print_arr(array,n);
	        int missingNumber = findMissingNumber(array);
	        System.out.println("The missing number is: " + missingNumber);
	    }
}
