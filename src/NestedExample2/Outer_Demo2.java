package NestedExample2;

public class Outer_Demo2 {
    // private bir variable alalım
    private int num = 175;

    // inner class
    public class Inner_Dmeo {
        public int getNum() {
            System.out.println("this is the getmethhod of the inner class");
            return num;
        }
    }
}


