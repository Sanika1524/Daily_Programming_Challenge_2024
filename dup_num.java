package duplicate_number;
import java.util.*;

public class dup_num {
    static void check(int arr[]) {
        int n = arr.length;
        boolean foundDuplicate = false;

        for (int i = 0; i < n; i++) 
        {
            for (int j = i + 1; j < n; j++) 
            {
                if (arr[i] == arr[j]) 
                {
                    System.out.println("Duplicate Number: " + arr[i]);
                    foundDuplicate = true;
                }
            }
        }

        if (!foundDuplicate)
        {
            System.out.println("No duplicate found!");
        }
    }

    static void print(int arr[]) 
    {
        for (int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) 
        {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array (n): ");
        int n = sc.nextInt();
        int[] array = new int[n + 1]; 

        System.out.println("Enter " + (n + 1) + " elements of the array: ");
        for (int i = 0; i < n + 1; i++) 
        {
            array[i] = sc.nextInt();
        }

        System.out.println("Array: ");
        print(array);

        check(array);

    }
}
