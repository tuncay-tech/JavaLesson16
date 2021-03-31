package NestedExample2;

import Nested.Outer_Demo;

public class My_Class2 {
    public static void main(String[] args) {
       // outer class dan bir nesne oluşturduk
        Outer_Demo2 outer = new Outer_Demo2(); // NESNE OLUŞTURDUK
        // inner class tan bir nesne oluştuurp yazdırıyoruz
        Outer_Demo2.Inner_Dmeo inner = outer.new Inner_Dmeo();
        System.out.println(inner.getNum());
    }
}
