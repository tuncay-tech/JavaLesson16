package NestedExample3;

public class OuterClass {

    void my_Method (){  // başında bişey olmadığından default oluyor
        int num = 23;

        class MethodInner_Demo {   //inner classımız  başında bişey olmadığından default oluyor
            public void print (){  // inner class içinde print diye bir metod tanımladık
                System.out.println(" this is method inner class : " + num);
            }
        } // end of the inner class

        // bizim inner clasımıza ulaşmamız-erişim-access için bir nesne oluşturuyoruz ki yazdıralım
        MethodInner_Demo inner = new MethodInner_Demo();
        inner.print();
    }
     // main miz
    public static void main(String[] args) {
        OuterClass outer = new OuterClass();  // outer classtan bir nesne yaptık
        outer.my_Method();
    }
}
