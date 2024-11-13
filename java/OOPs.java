package com.java;

public class OOPs {
    //Meth OverLoading
   public String format(double a){
       return String.format("%.3f",a);
   }
   public String format(int a){
       return String.format("%d", a);
   }
   public String format(String a){
       return String.format("%.2f",Double.parseDouble(a));
   }
    public static void main(String[] args) {

       OOPs obj= new OOPs();
        System.out.println(obj.format(35436));
        System.out.println( obj.format(569.8378));
        System.out.println(obj.format("84738"));
    }
}
