package com.arrays;

import java.util.EnumSet;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
enum Gfg{
    CODE, LEARN, CONTRIBUTE, QUIZ, MCQ
}
public class SetEx2 {
    public static void main(String[] args) {
        Set<String > strings= new HashSet<>();
        strings.add("India");
        strings.add("South africa");
        strings.add("Australia");
        strings.add("Turkey");

        System.out.println("Hash Set: " + strings);
        System.out.println("++++++++++++++++++");
        strings.remove("South africa");
        System.out.println(strings);
        strings.add("India");
        System.out.println("+++++++++++++++++++++++++");
        Iterator it= strings.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println("+++++++++++++++++++");
        Set<Gfg> set1;
        set1= EnumSet.of(Gfg.CODE, Gfg.LEARN, Gfg.CONTRIBUTE, Gfg.MCQ, Gfg.QUIZ);
        System.out.println("Enum: "+ set1);

        for (String s: strings){
            System.out.println(s);
        }
        System.out.println(set1.hashCode());
    }
}
