package com.sorting;

import java.util.Scanner;

public class SelectionSort {

    static void printArray(int[] arr){
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }
    //pick smallest element n puts on first
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);

        int[] arr= new int[5];

        for (int i=0; i < arr.length; i++){
            arr[i]= in.nextInt();
        }

        for (int i=0; i< arr.length -1; i++){
            int smallest=i;
            for (int j= i+1; j< arr.length;j++){
                if (arr[smallest]> arr[j]){
                    smallest=j;
                }
            }
            int temp= arr[smallest];
            arr[smallest]=arr[i];
            arr[i]= temp;
        }
     printArray(arr);



    }


}
