package com.test;

import java.util.ArrayList;

public class Generics<T> {
    T obj;

    public Generics(T obj) {
        this.obj = obj;
    }

    public T getObj() {
        return obj;
    }

   public static Double addAll(ArrayList<? extends Number> list){
        double sum=0.0;
        for (Number number: list){
            sum+= number.doubleValue();
        }
        return sum;
   }
    public static void main(String[] args) {
        Generics<Integer> integerGenerics= new Generics<>(10000);
        System.out.println(integerGenerics.getObj());
        Generics<Float> floatGenerics= new Generics<>(245.78f);
        System.out.println(floatGenerics.getObj());
        Generics<String> stringGenerics= new Generics<>(" hi there....");
        System.out.println(stringGenerics.getObj());

        ArrayList<Float> al1=new ArrayList<Float>();
        al1.add(1.5f);
        al1.add(2.0f);
        al1.add(2.5f);
        System.out.println("Sum of list elements: "+addAll(al1));
        ArrayList<Integer> al2=new ArrayList<Integer>();
        al2.add(50);
        al2.add(100);
        al2.add(200);
        System.out.println("Sum of list elements: "+addAll(al2));
    }
}
