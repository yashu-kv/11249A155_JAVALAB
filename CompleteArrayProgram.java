import java.util.Arrays;
import java.util.Scanner;
public class CompleteArrayProgram {
    static void display(int arr[]) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
    static void reverse(int arr[]) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    static int[] copyArray(int arr[]) {
        return Arrays.copyOf(arr, arr.length);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("\nOriginal Array:");
        display(arr);
        int sum = 0;
        for (int num : arr)
            sum += num;
        double average = (double) sum / n;
        System.out.println("\nSum = " + sum);
        System.out.println("Average = " + average);
        int max = arr[0];
        int min = arr[0];
        for (int num : arr) {
            if (num > max)
                max = num;
            if (num < min)
                min = num;
        }
        System.out.println("\nMaximum = " + max);
        System.out.println("Minimum = " + min);
        System.out.print("\nEnter element to search: ");
        int key = sc.nextInt();
        boolean found = false;
        for (int i = 0; i < n; i++) {
            if (arr[i] == key) {
                System.out.println("Element found at index " + i);
                found = true;
                break;
            }
        }
        if (!found)
            System.out.println("Element not found");
        Arrays.sort(arr);
        System.out.println("\nSorted Array:");
        display(arr);
        int index = Arrays.binarySearch(arr, key);
        if (index >= 0)
            System.out.println("Binary Search: Found at index " + index);
        else
            System.out.println("Binary Search: Not Found");
        reverse(arr);
        System.out.println("\nReversed Array:");
        display(arr);
        int copiedArray[] = copyArray(arr);
        System.out.println("\nCopied Array:");
        display(copiedArray);
        boolean equal = Arrays.equals(arr, copiedArray);
        System.out.println("\nArrays Equal? " + equal);
        int fillArray[] = new int(5);
        Arrays.fill(fillArray, 100);
        System.out.println("\nFilled Array:");
        display(fillArray);
        int matrix[][] = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        System.out.println("\n2D Array:");
        for(int i=0;i<matrix.length;i++) {
            for(int j=0;j<matrix[i].length;j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("\nEnhanced For Loop:");
        for(int value : arr) {
            System.out.print(value+" ");
        }
        System.out.println();
        System.out.println("\nLength of Array = " + arr.length);
        sc.close();
    }
}