package com.arrays;

import java.util.HashMap;
import java.util.Map;

public class FindSingleNumber {
    public static void main(String[] args) {

        int[] arr={2,2,1};
        int uniqueNum= findSingleNumber(arr);
       System.out.println(uniqueNum);
        int[] nums={4,1,2,1,2,4,5};
        int ans=findNonRepeatNum(nums);
        System.out.println(ans);
    }

    /**
     * Program to find Non-repetitive numbers in Array
     * @param arr
     * @return
     */
    public static int findSingleNumber(int[] arr){
        Map<Integer, Integer> integerCount= new HashMap<>();
        int result=0;
        for (int j : arr) {
            integerCount.put(j, integerCount.getOrDefault(j, 0) + 1);
        }
        for (int j : arr) {
            if (integerCount.get(j) == 1) {
                result = j;
            }
        }
        return result;
    }

    /**
     * Uses Bit XOR
     * @param arr
     *
     */
    public static int findNonRepeatNum(int[] arr){
        int result=0;
        for (int number: arr){
            result ^= number;
        }
        return result;
    }
}
