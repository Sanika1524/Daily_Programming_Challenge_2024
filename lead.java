package Leader;

import java.util.*;

public class lead {

    
    static void leader(int arr[]) {
        int n = arr.length;
        int max = arr[n - 1]; 
        System.out.print("Leaders in the array: " + max + " ");

        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] > max) {
                max = arr[i]; 
                System.out.print(max + " "); 
            }
        }
    }

    
    static void print_arr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array (n): ");
        int n = sc.nextInt();
        int[] array = new int[n + 1]; 

        System.out.println("Enter " + (n + 1) + " elements of the array: ");
        for (int i = 0; i < n + 1; i++) {
            array[i] = sc.nextInt();
        }

        System.out.print("Array: ");
        print_arr(array); 

        leader(array); 
    }
}
