package com.searching;

public class TernarySearch {
    static int ternarySearch(int l, int r, int[] ar, int key){
        if (r >= l){
            // Find the mid1 and mid2
            int mid1 = l + (r - l) / 3;
            int mid2 = r - (r - l) / 3;

            // Check if key is present at any mid
            if (ar[mid1] == key) {
                return mid1;
            }
            if (ar[mid2] == key) {
                return mid2;
            }

            // Since key is not present at mid,
            // check in which region it is present
            // then repeat the Search operation
            // in that region

            if (key < ar[mid1]) {

                // The key lies in between l and mid1
                return ternarySearch(l, mid1 - 1, ar, key);
            }
             else if (key > ar[mid2]) {

                // The key lies in between mid2 and r
                return ternarySearch(mid2 + 1, r, ar, key);
            }
            else {

                // The key lies in between mid1 and mid2
                return ternarySearch(mid1 + 1, mid2 - 1, ar, key);
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int l, r, p, key;
        l=0;
        int ar[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        r=ar.length;
        key=5;
        p= ternarySearch(l,r,ar,key);
        System.out.println("Index of " + key + " is " + p);
    }
}
