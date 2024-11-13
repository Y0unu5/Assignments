package com.test;

public class GenericsEx {
    public static void main(String[] args) {

        Integer[] a = { 100, 22, 58, 41, 6, 50 };

        Character[] c = { 'v', 'g', 'a', 'c', 'x', 'd', 't' };

        String[] s = { "Virat", "Rohit", "Abhinay", "Chandu","Sam", "Bharat", "Kalam" };

        sort(a);
        sort(s);
        sort(c);
    }
    public static <T extends Comparable<T>> void sort(T[] a){
        for (int i=0; i< a.length-1; i++){
            for (int j=0; j< a.length-i-1; j++){
                    if (a[j].compareTo(a[j+1])>0) {
                        swap(j,j+1,a);
                    }
            }
        }
        for (T i : a)
        {
            System.out.print(i + ", ");
        }
        System.out.println();
    }

    private static <T> void swap(int j, int i, T[] a) {
        T t = a[i];
        a[i] = a[j];
        a[j] = t;
    }
}
