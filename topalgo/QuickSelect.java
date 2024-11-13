package com.topalgo;

/**
 * Partition Function (partition):
 *
 * This function selects a pivot (in this case, the last element in the array) and partitions the array such that all elements smaller than the pivot are to the left, and all elements greater than the pivot are to the right.
 * The pivot is then placed in its correct position, and the function returns the index of the pivot.
 * QuickSelect Function (quickSelect):
 *
 * The quickSelect function takes the array, the starting and ending indices (low and high), and the position k (1-based index) of the element to be found.
 * It calls the partition function to get the pivot index pi.
 * Depending on the value of pi relative to k, the function either:
 * Returns the element if pi is equal to k-1 (because k is 1-based and pi is 0-based).
 * Recursively searches in the left half if pi > k-1.
 * Recursively searches in the right half if pi < k-1.
 * Main Method:
 *
 * An array arr is initialized with random integers.
 * The quickSelect function is called to find the k-th smallest element in the array.
 * The result is printed to the console.
 */
public class QuickSelect {

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low;

        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
            }
        }

        int temp= arr[i];
        arr[i]=arr[high];
        arr[high]=temp;
        return i;
    }
    public static int quickSelect(int[] arr, int low, int high, int k){
        if (low <= high){
            int partitionIndex= partition(arr, low, high);

            if (partitionIndex ==k-1){
               return arr[partitionIndex];
            }
            if (partitionIndex > k-1){
                return quickSelect(arr, low, partitionIndex-1, k);
            }
            return quickSelect(arr, partitionIndex + 1, high, k);

        }
        return Integer.MAX_VALUE;
    }

    public static void main(String[] args) {
        int[] arr = {12, 3, 5, 7, 4, 19, 26};
        int k = 3;
        int n = arr.length;
        int kthSmallest = quickSelect(arr, 0, n - 1, k);
        System.out.println("The " + k + "rd smallest element is " + kthSmallest);
    }
}
