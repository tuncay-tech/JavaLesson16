package Nested;

public class Outer_Demo {

    private class Inner_Dmeo{ // inner class açtık
        void print(){  // metod açtık

            System.out.println("inside the inner class");
        }
    }
    public void creatInnerObject(){  // metod açtık
        Inner_Dmeo inner_dmeo = new Inner_Dmeo();
        inner_dmeo.print();  // print çağırdık
    }
}
