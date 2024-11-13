package com.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysEx {
    //datatype[] var_name= new datatype[size];
    public static void main(String[] args) {

          Scanner scanner= new Scanner(System.in);

                  String[] str= new String[scanner.nextInt()];
                  for (int i=0; i < str.length; i++){
                      str[i]= scanner.next();
                  }
                 System.out.println(Arrays.toString(str));



        int[] arr= {2,3,22,44,66,77};
        swap(arr,1,3);

        var i = maxRagel(arr, 1, 3);
        System.out.println(i);

        reverseArr(arr);

        System.out.println(maxVal(arr));
    }

    static int maxVal(int[] arr) {
        int max= arr[0];
        for (int i=1; i< arr.length; i++){
            if (arr[i]> max){
                max= arr[i];
            }
        }
        return max;
    }


    static int maxRagel(int[] arr, int start, int end) {
        int max= arr[start];
        for (int i=start; i<= end; i++){
            if (arr[i]> max){
                max= arr[i];
            }
        }
        return max;
    }

    static void reverseArr(int[] arr){
        int start=0;
        int end= arr.length-1;
        while (start < end){
            swap(arr, start, end);
            start++;
            end--;
        }
    }

    static void swap(int[] arr, int index1,int index2){
        int temp= arr[index1];
        arr[index1] = arr[index2];
        arr[index2]= temp;
   }

}
