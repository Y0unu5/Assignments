package com.searching;

public class  BinarySearch {

     static int binarySearch(int[] arr, int x){
        int left=0, right= arr.length-1;

        while (left <= right){
            int mid= left + (right - left)/2;

            if (arr[mid] == x){
                return mid;
            }
            if (arr[mid] < x)
                return left= mid + 1;
            else
                return right = mid -1;
        }
        return -1;
    }

     public static int binary(int arr[], int traget){
         int left=0, right= arr.length-1;

         while (left <= right){
             int mid= left + (right - left)/2;

             if (arr[mid] == traget){
                 return mid;
             }
             if (arr[mid] < traget)
                 return left= mid + 1;
             else
                 return right= mid - 1;
         }

         return -1;
     }
    public static void main(String[] args) {
        int[] arr = { 2, 3, 4, 10, 40 };
        int x = 10;
        int res= binary(arr, x);
        System.out.println(res);
    }
}
