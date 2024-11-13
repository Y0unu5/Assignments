package com.searching;

public class RecursiveBinary {
    static int binarySearch(int[] arr, int l, int r, int x){
       if (r >= l){
           int mid= l + (r-l)/2;

           if (arr[mid] ==x)
               return mid;

           if (arr[mid] > x)
               return binarySearch(arr, l, mid-1,x);

           return binarySearch(arr, mid+1, r, x);
       }

       return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 2, 3, 4, 10, 40 ,45,90,50,1,5};
        int n = arr.length;
        int x = 1;
        int result = binarySearch(arr, 0, n - 1, x);
        System.out.println(result);
    }
}
