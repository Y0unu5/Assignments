package com.searching;

import java.util.Arrays;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr ={23,3,45,6,7,8,9,10,1,55};
        int target= 10;
        System.out.println(linearSearch(arr,target));
        //System.out.println(minNumber(arr));

        //2d array
        int[][] arr1={
                {23,4,1},
                {18,12,3,9},
                {78,99,34,56},
                {18,12}
        };
        int tar= 12;
        int[] ans = search2D(arr1,tar);
        System.out.println(Arrays.toString(ans));
        System.out.println(max2D(arr1));
        System.out.println(Arrays.deepToString(arr1));

    }

    static int linearSearch(int[] arr, int target){//int start, int end
        if (arr.length == 0)
            return -1;
        for (int i=0; i< arr.length; i++){
            int element= arr[i];
            if (element == target)
                return i;
        }
        return -1;
    }

    static int minNumber(int[] arr){
        int ans= arr[0];
        for (int i=1; i< arr.length; i++){
            if (arr[i]< ans){
                ans= arr[i];
            }
        }
        return ans;
    }
    //Search in 2d Array
    static  int[] search2D(int [][] arr, int target){
        for (int row=0; row< arr.length; row++){
            for (int col=0; col< arr[row].length;col++){
                if (arr[row][col]==target){
                    return new int[]{row,col};
                }
            }
        }
        return new int[]{-1,-1};
    }
    static  int max2D(int[][] arr){
        int max= Integer.MIN_VALUE;
        for (int[] ints : arr) {
            for (int element : ints) {
                if (element > max) {
                    max = element;
                }
            }
        }
        return max;

    }

}
