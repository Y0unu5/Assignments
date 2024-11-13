package com.java;
interface A{
    void getName(String name);
}
public class MethodRefEx {
    public static void getInfo(String info){
        System.out.println(info);
    }
    public static void main(String[] args) {

        A a= System.out::println;
        a.getName("Yunus is ....");

        A a2= MethodRefEx::getInfo;
        a2.getName("getInfo() of Test class is executing");
    }
}
