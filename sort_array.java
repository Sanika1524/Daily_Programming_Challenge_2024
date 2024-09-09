package sort_array;
import java.util.*;

public class sort_array {
	
	static void sort(int arr[],int n)
	{
		int i, j, temp;
        boolean swapped;
        for (i = 0; i < n - 1; i++)
        {
            swapped = false;
            for (j = 0; j < n - i - 1; j++) 
            {
                if (arr[j] > arr[j + 1]) 
                {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }

            if (swapped == false)
            {
                break;
            }
        }
	}
	
	static void print_arr(int arr[],int n)
	{
		for(int i=0;i<n;i++)
		{
			System.out.println(arr[i]+" ");
			System.out.println();
		}
	}
			
	public static void main(String[] args)
	{
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
		sort(array,n);
		System.out.println("sorted array: ");
		print_arr(array,n);
		
	}
}
