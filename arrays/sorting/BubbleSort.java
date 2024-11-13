package com.sorting;


import java.util.Scanner;

public class BubbleSort {
    static void printArray(int[] arr){
        for (int i=0; i< arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);

        int[] arr= new int[5];

        for (int i=0; i < arr.length; i++){
            arr[i]= in.nextInt();
        }
        printArray(arr);


        for (int j=0; j< arr.length-1; j++){
            for (int k=0; k < arr.length -j-1; k++){
                if (arr[k] > arr[k+1]){
                    int temp= arr[k];
                    arr[k]= arr[k+1];

                }
            }
        }        System.out.println("******************************");

        /**n
         *  for (int j=0; j< arr.length -1; j++){
         *             for (int k=0; k< arr.length-j-1; k++){
         *                 if (arr[k]> arr[k+1]){
         *                     int temp= arr[k];
         *                     arr[k]=arr[k+1];
         *                     arr[k+1]=temp;
         *                 }
         *             }
         *         }
         */

        printArray(arr);
        for (int i=0; i< arr.length-1;i++){
            int smallest=i;
            for (int j=i+1; j< arr.length; j++){
                if (arr[smallest] > arr[j]){
                    smallest=j;
                }
            }
            int temp= arr[smallest];
            arr[smallest]=arr[i];
            arr[i]=temp;
        }



    }



    //Time Complexity O(n^2)
}
